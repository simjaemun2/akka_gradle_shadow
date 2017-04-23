import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;

/**
 * Created by 1 on 2017-04-23.
 */
public class AkkaMain {
    public static void main(String[] args) {
        Config config = ConfigFactory.parseFile(new File("akka.conf"));

        ActorSystem actorSystem = ActorSystem.create("MySystem", config);
        ActorRef ref = actorSystem.actorOf(Props.create(MyActor.class), "myactor");

        ref.tell("Hello!!", ActorRef.noSender());
    }
}

class MyActor extends UntypedActor {

    @Override
    public void onReceive(Object message) throws Throwable {
        System.out.println((String)message);
    }
}
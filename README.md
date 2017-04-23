Shadow gradle plugin for Akka
=============================

Simple java project using akka library.
Project build tool is Gradle.

To avoid below exception, I used 'shadow' Gradle plugin.
<pre><code>
Exception in thread "main" com.typesafe.config.ConfigException$Missing: No configuration setting found for key 'akka.version'
</code></pre>


If you want to read detail akka documents for this exception, see below akka document.

http://doc.akka.io/docs/akka/snapshot/general/configuration.html#When_using_JarJar__OneJar__Assembly_or_any_jar-bundler

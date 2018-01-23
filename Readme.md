# NewRelic OpenTracing Issue

Run the following to build

```bash
mvn clean compile assembly:single 
```

Run without newrelic agent

```bash
$ java -jar target/opentracing-newrelic-issue-1.0-jar-with-dependencies.jar 
Starting...
Finished...
```

Run with newrelic agent 3.45 or 3.46

```bash
$ java -javaagent:newrelic.jar -jar target/opentracing-newrelic-issue-1.0-jar-with-dependencies.jar 
objc[19930]: Class JavaLaunchHelper is implemented in both /Users/elijordan/.jenv/versions/1.8/bin/java (0x10c21b4c0) and /Library/Java/JavaVirtualMachines/jdk1.8.0_66.jdk/Contents/Home/jre/lib/libinstrument.dylib (0x10c3154e0). One of the two will be used. Which one is undefined.
Jan 23, 2018 13:56:16 +1100 [19930 1] com.newrelic INFO: New Relic Agent: Loading configuration file "/Users/elijordan/Desktop/opentracing-newrelic-issue/agent/./newrelic.yml"
Jan 23, 2018 13:56:17 +1100 [19930 1] com.newrelic INFO: New Relic Agent: Writing to log file: /Users/elijordan/Desktop/opentracing-newrelic-issue/agent/logs/newrelic_agent.log
Starting...
Exception in thread "main" java.lang.NoSuchFieldError: PEER_HOST_IPV4
        at Main.main(Main.java:14)
```


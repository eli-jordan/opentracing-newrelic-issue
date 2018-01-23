import io.opentracing.Span;
import io.opentracing.Tracer;
import io.opentracing.mock.MockTracer;
import io.opentracing.tag.Tags;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Starting...");

        Tracer tracer = new MockTracer();

        Span span = tracer.buildSpan("test-span").withTag(Tags.PEER_HOST_IPV4.getKey(), "1.2.3.4").start();

        Thread.sleep(100);

        span.finish();

        System.out.println("Finished...");
    }
}

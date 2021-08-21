package org.acme.kafka.processor;

import io.smallrye.reactive.messaging.annotations.Blocking;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.CompletionStage;

@ApplicationScoped
public class Example {

  @Incoming("topic1")
  @Incoming("topic2")
  @Blocking
  public CompletionStage<Void> process(Message<String> msg) {
    return msg.ack();
  }

//  @Incoming("topic1")
//  @Incoming("topic2")
//  @Blocking
//  public void process(String msg) {
//    System.out.println("msg: " + msg);
//  }
}

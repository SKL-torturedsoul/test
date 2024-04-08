package de.skl.monitoring;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

 private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);
	
  private static final String template = "Hello, %s!";
  private final AtomicLong counter = new AtomicLong();

  @GetMapping("/")
  @ResponseBody
  public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Stranger") String name) {
	  System.out.println("New item with number: " + counter + " created");
	  LOGGER.trace("doStuff needed more information - {}", counter);
	    LOGGER.debug("doStuff needed to debug - {}", counter);
	    LOGGER.info("doStuff took input - {}", counter);
	    LOGGER.warn("doStuff needed to warn - {}", counter);
	    LOGGER.error("doStuff encountered an error with value - {}", counter);
	  return new Greeting(counter.incrementAndGet(), String.format(template, name));
  }

}
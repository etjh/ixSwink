package nl.etjh.ixswink.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import nl.etjh.ixswink.IntegrationTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}

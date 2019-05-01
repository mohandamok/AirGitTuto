import groovy.xml.*;
import fr.amadeus.ws.air.test.context.ScriptContext;


// creates a new script context with the SoapUI utility objects
void createScriptContext(log, context, testRunner){
    ScriptContext scriptContext = new ScriptContext(log, context, testRunner);

    if(context.testCase.testSuite.project.context.sc != null){
        log.warn ("The ScriptContext contains already a sc property. It is going to be replaced with a new ScriptContext object")
    }

    // put the scriptContext into the sc variable inside the project context
    context.testCase.testSuite.project.context.sc = scriptContext

    log.info "ScriptContext ready to be used with: 'context.testCase.testSuite.project.context.sc' ";
}
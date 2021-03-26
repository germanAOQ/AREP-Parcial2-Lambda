package edu.escuelaing.arep.services;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import edu.escuelaing.arep.model.Response;

public class MathServices {

    public static String tan(Double input) {
        Response response = new Response();
        response.setOperation("tan");
        response.setInput(input);
        response.setOutput(Math.tan(input));
        return "{operation:tan, input:"+response.getInput().toString()+", output:"+response.getOutput().toString()+"}";

    }
}
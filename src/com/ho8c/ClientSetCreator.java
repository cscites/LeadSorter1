package com.ho8c;

import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by chris.scites on 6/12/2017.
 */
public class ClientSetCreator {
    private ArrayList<Client> clients = new ArrayList<>();
    private String[] headers;

    ClientSetCreator(String source) throws IOException, ArrayIndexOutOfBoundsException {
        CsvParser clientSet = new CsvParser(source);
        headers = clientSet.getHeaders();

        ArrayList<CSVRecord> variables = clientSet.getVariableSets();


        for (CSVRecord var : variables) {

            Client client = new Client(var.get(0), var.get(1), var.get(2), var.get(3), var.get(4), var.get(5), var.get(6),
                    var.get(7), var.get(8), var.get(9), var.get(10));
            clients.add(client);

        }
    }

    ArrayList<Client> getClientSet(){
        return clients;
    }

    String[] getHeaders(){
        return headers;
    }
}

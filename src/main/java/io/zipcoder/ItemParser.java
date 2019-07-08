package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.List;
import java.util.regex.Pattern;

public class ItemParser {



    public List<Item> parseItemList(String valueToParse) {
        StringBuilder sb = new StringBuilder(valueToParse.toLowerCase());
       // List<Item> items = new List<Item>()}

        Pattern.compile("##").matcher(sb).replaceAll(",");
        Pattern.compile(";").matcher(sb).replaceAll(":");

        return null;
    }

    public String decode(String singleItem){
        Item newItem;
       /* String lowerCase = Pattern.compile(singleItem).matcher(singleItem)
                .replaceAll(matche -> matche.
                        //().toUpperCase());*/
        StringBuilder sb = new StringBuilder(singleItem.toLowerCase());
        Pattern.compile(";").matcher(sb).replaceAll(",");
        Pattern.compile("@").matcher(sb).replaceAll(":");
        Pattern.compile("%").matcher(sb).replaceAll(":");
        String decode = sb.toString();

        return decode;

    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        Item newItem;
       /* String lowerCase = Pattern.compile(singleItem).matcher(singleItem)
                .replaceAll(matche -> matche.
                        //().toUpperCase());*/
        StringBuilder sb = new StringBuilder(singleItem.toLowerCase());
        Pattern.compile("##").matcher(sb).replaceAll(",");
        Pattern.compile(":").matcher(sb).replaceAll("+");
        Pattern.compile(";").matcher(sb).replaceAll(":");
        Pattern.compile("@").matcher(sb).replaceAll("+");
        //Pattern.compile("^").matcher(sb).replaceAll("+");
        //Pattern.compile("*").matcher(sb).replaceAll("+");
        Pattern.compile("%").matcher(sb).replaceAll("+");
        String decode = sb.toString();








        return null;
    }
}


//if
package io.zipcoder;

import io.zipcoder.utils.Item;
import io.zipcoder.utils.ItemParseException;

import java.util.List;
import java.util.regex.Pattern;

public class ItemParser {



    public List<Item> parseItemList(String valueToParse) {
        StringBuilder sb = new StringBuilder(valueToParse);
        Pattern.compile("##").matcher(sb).replaceAll(",");
        Pattern.compile(";").matcher(sb).replaceAll(":");

        return null;
    }

    public Item parseSingleItem(String singleItem) throws ItemParseException {
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm2027_lab4;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author 1204798
 */
public class GeneralDictionary implements Dictionary {

	private SortedMap<String, String> map;
	
	public GeneralDictionary() {
		map = new TreeMap<String, String>();
		map.put("book", "a set of printed pages, bound with a cover");
		map.put("editor", "a person who edits a book");
	}
	
	
	@Override
	public String getDefinition(String word) {
		return map.get(word);
	}
	
}

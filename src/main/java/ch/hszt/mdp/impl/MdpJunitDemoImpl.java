package ch.hszt.mdp.impl;

import ch.hszt.mdp.IMdpJunitDemo;

public class MdpJunitDemoImpl implements IMdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if(null == s) {
			return true;
		}
		
		if(0 == s.length()) {
			return true;
		}
		
		return false;
	}

	@Override
	public String capitalize(String s) {
		
		if(!this.isEmpty(s)) {
			s = s.toLowerCase();
			
			String firstLetter = s.substring(0, 1);
			firstLetter = firstLetter.toUpperCase();
			
			return firstLetter.concat(s.substring(1));
			
		}
		
		return null;
	}

	@Override
	public String reverse(String s) throws NullPointerException {
		
		if(s == null) {
			throw new NullPointerException();
		}
		
		int length = s.length();
	    StringBuffer reverse = new StringBuffer(length);
	    
	    for(int i = length - 1; i >= 0; i--) {
	    	reverse.append(s.charAt(i));
	    }
	    
	    return reverse.toString();
		
	}

	@Override
	public String join(String... strings) {
		if(strings == null || strings.length == 0) {
			return null;
		}
		
		String join = strings[0];
		
		for(int i = 1; i<strings.length; i++) {
			join = join.concat(" " + strings[i]);
		}
		
		return join;
	}

}

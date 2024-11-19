package com.sat.inte;

import javax.jws.*;
import com.sat.mods.Books;

import java.util.*;

@WebService
public interface NFace {
	@WebMethod
	public String restRev(String a);
	
	@WebMethod
	public List<Books> lsBooks();
	
	@WebMethod
	public Books retSingle();
}

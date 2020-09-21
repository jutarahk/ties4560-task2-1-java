package servlet;

import com.soap.services.WSImpl;
import com.soap.services.WSImplService;

public class Soap {
public Soap() {}

	public int addAmount(int param1, int param2) {
		//Breaks here, found the breaking point by debugging the program.
		//The goal was to create a soap object by connecting to a port.
		//It fails for some reason that I didn't manage to figure out.
		WSImplService service = new WSImplService();
		WSImpl port = service.getWSImplPort();
		int result = port.addAmount(param1, param2);
		return result;
	}

}

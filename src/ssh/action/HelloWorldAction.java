package ssh.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	@Override
	public String execute() throws Exception {
		message = "Hello World! :)";
		return SUCCESS;
	}
	
	public String getMessage() {
		return message;
	}

}

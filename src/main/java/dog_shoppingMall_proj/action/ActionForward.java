package dog_shoppingMall_proj.action;

public class ActionForward {
	private String path;
	private boolean redirect;

	public ActionForward(String path) {
		this.path = path;
	}

	public ActionForward() {
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public ActionForward(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}

	public boolean isRedirect() {
		return redirect;
	}

	public void setRedirect(boolean redirect) {
		this.redirect = redirect;
	}

}

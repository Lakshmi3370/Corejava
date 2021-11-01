class TestWebBrowser {
	public static void main(String[] args) {
		WebBrowser w = new WebBrowser ();
		
	w.ProjectName = "Web Browser";
	String wProjectName = w.ProjectName;
	System.out.println(wProjectName);
	
	w.ProjectId = 122;
	int wProjectId = w.ProjectId;
	System.out.println(wProjectId);
	}
}
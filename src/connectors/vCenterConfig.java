package connectors;


@SuppressWarnings("static-access")
public class vCenterConfig {
   
	private static String adminURL="****";
    private static String adminUser="****";
    private static String URL="****";
    private static String uName="administrator";

    private static String adminPass="***";
    private static String pWord="***";

    private static String hostUser="root";
    
    public static String getHostUser() {
		return hostUser;
	}

	public String getURL() {
        return URL;
    }

	public void setURL(String URL) {
        this.URL = URL;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    public static String getAdminUser() {
    	return adminUser;
    }

    public static String getAdminURL() {
    	return adminURL;
    }

    public static String getAdminPass() { 
    	return adminPass; 
    }

}

package utilityclasses;

public class URLGenerator {

	public String getUsers = "/users";
	public String addUser = "/users";
	public String updateUser = "/users/";
	public String deleteUser = "/users/";
	public String getSpecificUser="/users/";

	public URLGenerator(String baseURL) {
		getUsers = baseURL + getUsers;
		addUser = baseURL + addUser;
		updateUser = baseURL + updateUser;
		deleteUser = baseURL + deleteUser;
		getSpecificUser = baseURL + getSpecificUser;
	}
}

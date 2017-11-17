package fpa1;

public class Reisefuehrer
{
	private String vorname;
	private String name;
	private String email;
	
	public Reisefuehrer
	{}
	
	public Reisefuehrer(String vorname, String, name, String email)
	{
		this.vorname = vorname;
		this.name = name;
		this.email = email;
	}
	
	public String getVorname()
	{
		return vorname;
	}
	
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email;
	}
}
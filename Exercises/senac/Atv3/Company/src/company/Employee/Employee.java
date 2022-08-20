package company.Employee;

/**
 * Super class with the main attributes of its subclasses Employees
 * @author kelvi
 */
public class Employee
{
    private String Name;
    private String Cpf;
    private String Adress;
    private String Phone;
    private String Sector;

    /**
     * Name Getter
     * @return Name
     */
    public String getName()
    {
        return Name;
    }

    /**
     * Name Setter
     * @param Name
     */
    public void setName(String Name)
    {
        this.Name = Name;
    }

    /**
     * Cpf Getter
     * @return Cpf
     */
    public String getCpf()
    {
        return Cpf;
    }

    /**
     * Cpf Setter
     * @param Cpf
     */
    public void setCpf(String Cpf)
    {
        this.Cpf = Cpf;
    }

    /**
     * Address Getter
     * @return Adress
     */
    public String getAdress()
    {
        return Adress;
    }

    /**
     * Adress Setter
     * @param Adress
     */
    public void setAdress(String Adress)
    {
        this.Adress = Adress;
    }

    /**
     * Phone Getter
     * @return Phone
     */
    public String getPhone()
    {
        return Phone;
    }

    /**
     * Phone Setter
     * @param Phone
     */
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }

    /**
     * Sector Getter
     * @return Sector
     */
    public String getSector()
    {
        return Sector;
    }

    /**
     * Sector Setter
     * @param Sector
     */
    public void setSector(String Sector)
    {
        this.Sector = Sector;
    }

    
      
}



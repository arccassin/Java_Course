package core;

public class Car
{
    private String number;
    private Integer height;
    private Double weight;
    private Boolean hasVehicle;

    public void setNumber(String number)
    {
        this.number = number;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public void setWeight(Double weight)
    {
        this.weight = weight;
    }

    public Boolean getHasVehicle()
    {
        return hasVehicle;
    }

    public void setHasVehicle(Boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }

    public Boolean getSpecial()
    {
        return isSpecial;
    }

    public void setSpecial(Boolean special)
    {
        isSpecial = special;
    }

    private Boolean isSpecial;

    public Car(String carNumber, Integer carHeight, Double carWeight, Boolean carHasVehicle)
    {
        number = carNumber;
        height = carHeight;
        weight = carWeight;
        hasVehicle = carHasVehicle;
        isSpecial = false;
    }

    //=========================================================================

    public void setIsSpecial()
    {
        isSpecial = true;
    }

    //=========================================================================

    public String getNumber()
    {
        return number;
    }

    public Integer getHeight()
    {
        return height;
    }

    public Boolean isSpecial()
    {
        return isSpecial;
    }

    public Boolean hasVehicle()
    {
        return hasVehicle;
    }

    //=========================================================================

    Double getWeight()
    {
        return weight;
    }

    //=========================================================================

    public String toString()
    {
        //String special
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}
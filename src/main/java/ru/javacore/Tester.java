package ru.javacore;

public class Tester {
    public String Name;
    public String SurName;
    public int ExperienceInYears;
    public String EnglishLevel;
    public double Salary;

    public Tester() { }

    public Tester(String name)
    {
        this.Name = name;
    }

    public Tester(String name, String surname)
    {
        this(name);
        this.SurName = surname;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary)
    {
        this(name, surname);
        this.ExperienceInYears = experienceInYears;
        this.EnglishLevel = englishLevel;
        this.Salary = salary;
    }

    @Override
    public String toString()
    {
        return "Имя: " + Name + "\nФамилия: " + SurName + "\nОпыт работы в годах: " + ExperienceInYears + "\nУровень английского языка: " + EnglishLevel + "\nЗарплата: " + Salary;
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return new Tester(Name, SurName, ExperienceInYears, EnglishLevel, Salary);
    }

    public String testMethod(int a, int b)
    {
        return a + " + " + b;
    }

    public double testMethod(double a, double b)
    {
        return a + b;
    }

    public void testMethod(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    public static void showStatic()
    {
        System.out.println("Статический метод!");
    }
}
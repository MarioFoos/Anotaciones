package com.diardon;

import java.util.ArrayList;
import com.diardon.SampleAnnotations.CampoAnotado;
import com.diardon.SampleAnnotations.MetodoAnotadoSimple;
import com.diardon.SampleAnnotations.MetodoOCampoAnotado;

public class SampleClass
{
	@CampoAnotado
	private String str;
	@CampoAnotado("Nota de num1")
	private Double num1;
	@MetodoOCampoAnotado(valor="Lista de números")
	private ArrayList<Integer> numbers;
	private int num2;
	private float num3;
	
	public SampleClass()
	{
		this("wasd1234", 1.23, new ArrayList<>(), 7, 3.21f);

		// Cargo algunos número al array
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
	}
	public SampleClass(String str, Double num1, ArrayList<Integer> numbers, int num2, float num3)
	{
		super();
		this.str = str;
		this.num1 = num1;
		this.numbers = numbers;
		this.num2 = num2;
		this.num3 = num3;
	}
	@Override
	public String toString()
	{
		return "SampleClass [str=" + str + ", num1=" + num1 + ", numbers=" + numbers + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
	@MetodoAnotadoSimple
	public void setStr(String str)
	{
		this.str = str;
	}
	public String getStr()
	{
		return str;
	}
	@MetodoOCampoAnotado(valor = "Anotación del set", entero = 7)
	public void setNumbers(ArrayList<Integer> numbers)
	{
		this.numbers = numbers;
	}
	@MetodoOCampoAnotado(valor = "Anotación del get")
	public ArrayList<Integer> getNumbers()
	{
		return numbers;
	}
}

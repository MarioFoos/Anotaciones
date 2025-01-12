package com.diardon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Clase donde definimos distintos tipos de anotaciones
 */
public class SampleAnnotations
{
	/**
	 * Anotaci�n de valor �nico, con valor por defecto, disponible en tiempo de ejecuci�n.
	 * Aplicable solo a campo
	 */
	@Retention(RetentionPolicy.RUNTIME)		// Disponible en tiempo de ejecuci�n
	@Target(ElementType.FIELD)				// Aplicable solo a campos
	public @interface CampoAnotado
	{
	    String value() default "Anotaci�n de campo";	// Valor simple por defecto
	}

	/**
	 * Anotaci�n de valor �nico, con valor por defecto, disponible en tiempo de ejecuci�n.
	 * Aplicable solo a m�todos
	 */
	@Retention(RetentionPolicy.RUNTIME)		// Disponible en tiempo de ejecuci�n
	@Target(ElementType.METHOD)				// Aplicable solo a m�todos
	public @interface MetodoAnotadoSimple
	{
	    String value() default "Anotaci�n Por defecto";	// Valor simple por defecto
	}

	/**
	 * Anotaci�n compleja, con valor un valor por defecto y otro requerido, disponible en tiempo de ejecuci�n
	 * Aplicable a m�todos o campos
	 */
	@Retention(RetentionPolicy.RUNTIME)					// Disponible en tiempo de ejecuci�n
	@Target({ElementType.METHOD, ElementType.FIELD}) 	// Aplicable a m�todos y campos
	public @interface MetodoOCampoAnotado
	{
	    String valor();          	// Elemento requediro
	    int entero() default 1;		// Elemento opcional con valor por defecto
	}
}

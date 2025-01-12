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
	 * Anotación de valor único, con valor por defecto, disponible en tiempo de ejecución.
	 * Aplicable solo a campo
	 */
	@Retention(RetentionPolicy.RUNTIME)		// Disponible en tiempo de ejecución
	@Target(ElementType.FIELD)				// Aplicable solo a campos
	public @interface CampoAnotado
	{
	    String value() default "Anotación de campo";	// Valor simple por defecto
	}

	/**
	 * Anotación de valor único, con valor por defecto, disponible en tiempo de ejecución.
	 * Aplicable solo a métodos
	 */
	@Retention(RetentionPolicy.RUNTIME)		// Disponible en tiempo de ejecución
	@Target(ElementType.METHOD)				// Aplicable solo a métodos
	public @interface MetodoAnotadoSimple
	{
	    String value() default "Anotación Por defecto";	// Valor simple por defecto
	}

	/**
	 * Anotación compleja, con valor un valor por defecto y otro requerido, disponible en tiempo de ejecución
	 * Aplicable a métodos o campos
	 */
	@Retention(RetentionPolicy.RUNTIME)					// Disponible en tiempo de ejecución
	@Target({ElementType.METHOD, ElementType.FIELD}) 	// Aplicable a métodos y campos
	public @interface MetodoOCampoAnotado
	{
	    String valor();          	// Elemento requediro
	    int entero() default 1;		// Elemento opcional con valor por defecto
	}
}

package com.diardon;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import com.diardon.SampleAnnotations.CampoAnotado;
import com.diardon.SampleAnnotations.MetodoAnotadoSimple;
import com.diardon.SampleAnnotations.MetodoOCampoAnotado;

public class AnotacionesApp
{
	public static void main(String[] args)
	{
        Class<?> klass = SampleClass.class;

        // Verificar métodos anotados para cada anotación definida
        for(Method metodo : klass.getDeclaredMethods())
        {
            if(metodo.isAnnotationPresent(MetodoAnotadoSimple.class))
            {
            	MetodoAnotadoSimple anotacion = metodo.getAnnotation(MetodoAnotadoSimple.class);
                System.out.println("Método: " + metodo.getName());
                System.out.println("Value: " + anotacion.value());
                System.out.println();
            }
            if(metodo.isAnnotationPresent(MetodoOCampoAnotado.class))
            {
            	MetodoOCampoAnotado anotacion = metodo.getAnnotation(MetodoOCampoAnotado.class);
                System.out.println("Método: " + metodo.getName());
                System.out.println("Valor: " + anotacion.valor());
                System.out.println("Entero: " + anotacion.entero());
                System.out.println();
            }
        }
        // Verificar campos anotados para cada anotación definida
        for(Field campo : klass.getDeclaredFields())
        {
            if (campo.isAnnotationPresent(CampoAnotado.class))
            {
            	CampoAnotado anotacion = campo.getAnnotation(CampoAnotado.class);
                System.out.println("Campo: " + campo.getName());
                System.out.println("Value: " + anotacion.value());
            }
        }
    }
}

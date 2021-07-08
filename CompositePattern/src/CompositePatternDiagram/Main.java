/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompositePatternDiagram;

/**
 *
 * @author mjoha
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiagramaComponente diagramaG = new DiagramaComponente("En el diagrama General");
        DiagramaComponente diagrama1 = new DiagramaComponente("En el diagrama 1");
        DiagramaComponente diagrama2 = new DiagramaComponente("En el diagrama 2");
        //DiagramaComponente diagramaCi = new DiagramaComponente("CIRCULO");
        //DiagramaComponente diagramaCu = new DiagramaComponente("CUADRADO");
        
        int figuras1 = diagramaG.addDiagrama(diagrama1);
        int figuras2 = diagramaG.addDiagrama(diagrama2);
        
        CirculoHoja circulo = new CirculoHoja("Circulo 1"){};
        CuadradoHoja cuadrado = new CuadradoHoja("Cuadrado 1"){};
        TrianguloHoja triangulo = new TrianguloHoja("Triangulo 1"){};
        CirculoHoja circulo2 = new CirculoHoja("Circulo 2"){};
        CuadradoHoja cuadrado2 = new CuadradoHoja("Cuadrado 2"){};
        TrianguloHoja triangulo2 = new TrianguloHoja("Triangulo 2"){};
         
        int firstCirculo1 = diagrama1.addDiagrama(circulo);
        int firstCuadrado1 = diagrama1.addDiagrama(cuadrado);
        int firstTriangulo1 = diagrama1.addDiagrama(triangulo);
        int secondCirculo1 = diagrama2.addDiagrama(circulo2);
        int secondCuadrado1 = diagrama2.addDiagrama(cuadrado2);
        int secondTriangulo1 = diagrama2.addDiagrama(triangulo2);
        
        //diagrama1.pintar();
        DiagramaComponente dibujando1 = (DiagramaComponente) diagramaG.getDiagrama(figuras1);
        dibujando1.pintar();
        DiagramaComponente dibujando2 = (DiagramaComponente) diagramaG.getDiagrama(figuras2);
        dibujando2.pintar();
        CirculoHoja dibujo3 = (CirculoHoja) dibujando1.getDiagrama(firstCirculo1);
        dibujo3.pintar();
        CuadradoHoja dibujo4 = (CuadradoHoja) dibujando2.getDiagrama(secondCuadrado1);
        dibujo4.pintar();
            
        
    }
    
}

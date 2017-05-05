package experimento;

import java.util.ArrayList;
import java.util.List;

public class MaquinaEstructura {

	// Interfaz de las operaciones
	public interface Operaciones{
		
		public Nodo buscar(int idNodo);
		
		public boolean agregar(Nodo nuevoNodo);
		
	}
	
	// Clase generica nodo
	public class Nodo{
		private int id;
		
		public Nodo(int id){
			this.id = id;
		}
		
		public int getId(){
			return id;
		}
	}
	
	
	
	// Clase que representa al nodo de un arbol binario
	public class NodoArbolBinario extends Nodo{

		private NodoArbolBinario derecha;
		
		private NodoArbolBinario izquierda;
		
		public NodoArbolBinario(int id) {
			super(id);
		}

		public NodoArbolBinario getDerecha() {
			return derecha;
		}

		public void setDerecha(NodoArbolBinario derecha) {
			this.derecha = derecha;
		}

		public NodoArbolBinario getIzquierda() {
			return izquierda;
		}

		public void setIzquierda(NodoArbolBinario izquierda) {
			this.izquierda = izquierda;
		}
		
	}
	
	// Clase que representa a un arbol binario
	public class ArbolBinario implements Operaciones{

		private NodoArbolBinario raiz;
		
		public ArbolBinario(NodoArbolBinario nodoRaiz) {
			raiz = nodoRaiz;
		}
		
		@Override
		public Nodo buscar(int idNodo) {
			
			return null;
		}

		@Override
		public boolean agregar(Nodo nuevoNodo) {
			
			return false;
		}
		
	}
	
	// Clase que representa a un nodo de un grafo
	public class NodoGrafo extends Nodo{

		private List<NodoGrafo> listaAdyacencia;
		
		public NodoGrafo(int id) {
			super(id);
			listaAdyacencia = new ArrayList<>();
		}
		
		public List<NodoGrafo> getListaAdyacencia(){
			return listaAdyacencia;
		}
		
	}
	
	// Clase que representa a un grafo dirigido
	public class GrafoDirigido implements Operaciones{

		private NodoGrafo fuente;
		
		public GrafoDirigido(NodoGrafo nodoFuente) {
			fuente = nodoFuente;
		}
		
		@Override
		public Nodo buscar(int idNodo) {
			
			return null;
		}

		@Override
		public boolean agregar(Nodo nuevoNodo) {
			
			return false;
		}
		
	}
	
	
	
	
}

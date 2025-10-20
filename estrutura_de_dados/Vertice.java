import java.util.ArrayList;

public class Vertice<TIPO> {
 private TIPO dado;
  private ArrayList<Aresta<TIPO>> arestasSaidas;
  private ArrayList<Aresta<TIPO>> arestasEntradas;



 public Vertice(TIPO dado) {
  this.dado = dado;
  this.arestasEntradas = new ArrayList<Aresta<TIPO>>();
  this.arestasSaidas = new ArrayList<Aresta<TIPO>>();

 }

 public TIPO getDado() {
  return dado;
 }

 public void setDado(TIPO dado) {
  this.dado = dado;
 }

 public void adicionarArestaEntrada(Aresta<TIPO> aresta){
  this.arestasEntradas.add(aresta);
 }

 public void adicionarArestaSaida(Aresta<TIPO> aresta){
  this.arestasSaidas.add(aresta);
 }

 public ArrayList<Aresta<TIPO>> getArestasSaidas() {
  return arestasSaidas;
 }

 public void setArestasSaidas(ArrayList<Aresta<TIPO>> arestasSaidas) {
  this.arestasSaidas = arestasSaidas;
 }

 public ArrayList<Aresta<TIPO>> getArestasEntradas() {
  return arestasEntradas;
 }

 public void setArestasEntradas(ArrayList<Aresta<TIPO>> arestasEntradas) {
  this.arestasEntradas = arestasEntradas;
 }

 

}

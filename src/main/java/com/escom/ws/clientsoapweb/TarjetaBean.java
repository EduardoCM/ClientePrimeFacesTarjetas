package com.escom.ws.clientsoapweb;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.tajetas.cliente.TarjetasClientes.ClienteTarjetaDigitales;
import org.tarjeta.digital.service.Tarjeta;

/**
 *
 * @author edcastillo
 */
@ManagedBean
@RequestScoped
public class TarjetaBean {

	public Tarjeta tarjeta;

	public List<Tarjeta> lstTarjetas;

	public ClienteTarjetaDigitales clienteTarjeta;

	public TarjetaBean() {
		lstTarjetas = new ArrayList<Tarjeta>();
		tarjeta = new Tarjeta();
	}

	public void guardarTarjeta() {
		System.out.println("::::: Guardar Tarjeta ::::::");
		clienteTarjeta = new ClienteTarjetaDigitales();
		System.out.println(":::: Tarjeta: " + tarjeta);
		clienteTarjeta.crearTarjeta(tarjeta);
	}

	public void listarTarjetas() {		
		clienteTarjeta = new ClienteTarjetaDigitales();
		System.out.println("::::: Listar tarjetas ::::::");
		lstTarjetas = clienteTarjeta.obtenerTodas();
		
		System.out.println(lstTarjetas);

	}

	public void eliminarId(String numeroTarjeta) {
		clienteTarjeta = new ClienteTarjetaDigitales();
		System.out.println("::::: ELiminar tarjeta :::::" + numeroTarjeta);
		clienteTarjeta.eliminarTarjeta(numeroTarjeta);
	}

	public void buscarId() {
		clienteTarjeta = new ClienteTarjetaDigitales();
		clienteTarjeta.obtenerTarjeta(tarjeta.getNumeroTarjeta());
	}

	public void actualizar() {


	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	public List<Tarjeta> getLstTarjetas() {
		return lstTarjetas;
	}

	public void setLstTarjetas(List<Tarjeta> lstTarjetas) {
		this.lstTarjetas = lstTarjetas;
	}

	public ClienteTarjetaDigitales getClienteTarjeta() {
		return clienteTarjeta;
	}

	public void setClienteTarjeta(ClienteTarjetaDigitales clienteTarjeta) {
		this.clienteTarjeta = clienteTarjeta;
	}

}

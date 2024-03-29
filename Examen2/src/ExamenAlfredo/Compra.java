package ExamenAlfredo;

import java.time.LocalDate;
import java.util.*;

public class Compra implements Enviable {
    /**
	 * @param cliente
	 */
	Compra(String cliente) {
		super();
		this.cliente = cliente;
	}

	protected List<LineaCompra> listaLineaCompra;
    protected Date fecha;
    protected double precioTotal;
    protected String cliente;

    /**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Compra(Date fecha) {
        this.fecha = fecha;
        this.listaLineaCompra = new ArrayList<>();
        this.precioTotal=0;
    }

    public Compra(LocalDate now) {
		// TODO Auto-generated constructor stub
	}

	public List<LineaCompra> getListaLineaCompra() {
        return listaLineaCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void addLinea(LineaCompra lc) {
        boolean encontrado = false;
        for (LineaCompra lineaCompra : listaLineaCompra) {
            if (lineaCompra.getProducto().equals(lc.getProducto())) {
                lineaCompra.setCantidad(lineaCompra.getCantidad() + lc.getCantidad());
                encontrado = true;
            }
        }
        if (!encontrado) {
            listaLineaCompra.add(lc);
        }
        actualizarPrecioTotal();
    }

    public void delLinea(LineaCompra lc) {
        listaLineaCompra.remove(lc);
        actualizarPrecioTotal();
    }

    public String crearEmail() {
    	
        StringBuilder sb = new StringBuilder();
        sb.append("Detalle de la compra realizada en nuestra tienda:").append("\n\n");
        sb.append("Fecha de compra: ").append(fecha.toString()).append("\n\n");
        sb.append("Lista de productos:\n");
        for (LineaCompra lc : listaLineaCompra) {
            sb.append("- ").append(lc.getCantidad()).append("x ").append(lc.getProducto().getNombre())
                    .append(" a ").append((lc.getProducto().getPrecio())).append(" = €")
                    .append((lc.subtotal())).append("\n");
        }
        sb.append("\n TOTAL : ").append((precioTotal));
        return sb.toString();
    }

    private void actualizarPrecioTotal() {
        precioTotal=this.precioTotal;
        for (LineaCompra lc : listaLineaCompra) {
            precioTotal += lc.subtotal();
        }
    }

    @Override
	public String toString() {
    	
		StringBuilder builder = new StringBuilder();
		builder.append("Compra [listaLineaCompra=");
		builder.append(listaLineaCompra);
		builder.append(", fecha=");
		builder.append(fecha);
		builder.append(", precioTotal=");
		builder.append(precioTotal);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}
}
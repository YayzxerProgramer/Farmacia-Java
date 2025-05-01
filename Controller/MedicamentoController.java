package Controller;

import Model.Medicamento;
import java.util.ArrayList;
import java.util.Date;

public class MedicamentoController {

    private final ArrayList<Medicamento> listaMedicamentos;

    public MedicamentoController() {
        listaMedicamentos = new ArrayList<>();
    }

    public boolean agregarMedicamento(String nombre, String laboratorio, String numeroLote, Date fechaVencimiento, int precio, int cantidad) {
        if (nombre.isEmpty() || laboratorio.isEmpty() || numeroLote.isEmpty() || fechaVencimiento == null || precio < 0) {
            return false;
        }

        Medicamento medicamento = new Medicamento(nombre, laboratorio, numeroLote, fechaVencimiento, precio, cantidad);
        listaMedicamentos.add(medicamento);
        return true;
    }

    public ArrayList<Medicamento> obtenerTodosLosMedicamentos() {
        return listaMedicamentos;
    }

    public boolean eliminarMedicamentoPorLote(String numeroLote) {
        return listaMedicamentos.removeIf(med -> med.getNumeroLote().equalsIgnoreCase(numeroLote));
    }

    public Medicamento buscarPorNombre(String nombre) {
        for (Medicamento m : listaMedicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return m;
            }
        }
        return null;
    }
}

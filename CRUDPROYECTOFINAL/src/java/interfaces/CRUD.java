package interfaces;

import java.util.List;
import model.Empleado;

public interface CRUD {
    
  public List listar();  
  public Empleado list(int id);
  public boolean add(Empleado emp);
  public boolean edit(Empleado emp);
  public boolean eliminar(int emp);
    
}

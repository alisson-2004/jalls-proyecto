package pe.com.yalls.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.yalls.entidades.EncabezadoBoleta;

public interface EncabezadoBoletaRepository extends JpaRepository<EncabezadoBoleta, String>{
    @Query("Select eb from EncabezadoBoleta eb where eb.estado='1'")
    List<EncabezadoBoleta> findAllCustom();
}

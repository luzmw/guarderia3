package dao;

import com.company.Gato;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class AveDAO implements InterfazDAO{


    private  static SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();





    @Override
    public void mostrarTodo() {

    }

    @Override
    public boolean eliminarPorId() {
        return false;
    }
}

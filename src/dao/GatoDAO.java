package dao;

import com.company.Gato;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GatoDAO implements InterfazDAO{

   private static SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();


    public static List<Gato> listarTodo(){
        Session session = sessionFactory.openSession();
        List<Gato>gatos = (List<Gato>)session.createQuery("FROM Gato").list();
        session.close();
        return gatos;

    }

    public static Gato buscar(int id){
        Session session = sessionFactory.openSession();
        Gato gato = session.load(Gato.class, id);
        return gato;
    }

    public static Gato buscar(String nombre){
        Session session = sessionFactory.openSession();
        return (Gato) session.createQuery("FROM  Gato  WHERE nombre LIKE ´%"+nombre+"%´").getSingleResult();


    }


    @Override
    public void mostrarTodo() {
        Session session = sessionFactory.openSession();
        for (Gato gato :(List<Gato>)session.createQuery("FROM Gato").list())
            System.out.println(gato);


    }

    @Override
    public void eliminarPorId(int id) {
        Session session = sessionFactory.openSession();
        Gato gatoAEliminar = session.load(Gato.class, id);
        session.delete(gatoAEliminar);
        session.getTransaction().commit();
        session.close();

    }
}

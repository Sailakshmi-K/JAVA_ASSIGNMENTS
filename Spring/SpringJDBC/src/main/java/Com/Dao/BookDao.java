package Com.Dao;

import org.example.Book;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class BookDao {
    private JdbcTemplate jt;

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    public int insertBook(Book b){
        String sql="insert into JTBookDetails values(?,?,?,?)";
        Object[] values={b.getBid(),b.getBookName(),b.getAuthorName(),b.getPrice()};
        System.out.println("Book details are inserted successfully");
        return jt.update(sql,values);
    }
    public int updateBook(String bn,float p){
        String sql="update JTBookDetails set price='"+p+"' where bookName='"+bn+"'";
        return jt.update(sql);
    }
    public int deleteBook(String bn){
        String sql="delete from JTBookDetails where bookName='"+bn+"'";
        return jt.update(sql);
    }
    public List<Book> fetch(){
        String sql="select * from JTBookDetails";
        List<Book> lbook = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws  SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return lbook;
    }
    public List<Book> fetchByName(String bn) {
        String sql ="select * from JTBookDetails where bookName ='"+bn+"' ";
        List<Book> bookList = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return bookList;
    }

    public List<Book> fetchByLike(String bn){
        String sql ="select * from JTBookDetails where bookName like '"+bn+"' ";
        List<Book> bookList = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return bookList;
    }

    public List<Book> fetchInBetween(int l,int h){
        String sql ="select * from JTBookDetails where price between '"+l+"' and '"+h+"' ";
        List<Book> bookList = jt.query(sql, new RowMapper() {
                    @Override
                    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
                        Book book = new Book();
                        book.setBid(resultSet.getInt(1));
                        book.setBookName(resultSet.getString(2));
                        book.setAuthorName(resultSet.getString(3));
                        book.setPrice(resultSet.getFloat(4));
                        return book;
                    }
                }
        );
        return bookList;
    }
}

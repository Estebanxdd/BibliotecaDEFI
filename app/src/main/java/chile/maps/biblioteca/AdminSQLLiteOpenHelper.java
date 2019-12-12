package chile.maps.biblioteca;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;


public class AdminSQLLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSQLLiteOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase Biblioteca) {

        Biblioteca.execSQL("CREATE TABLE LIBROS(codigo int primary key, nombre text, precio float)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion ) {

    }
}


package gelber.lab_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Factura extends AppCompatActivity {

    private TextView txt_pedido=null;
    private TextView txt_total= null;
    private Button btn_regresar=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura);
        txt_pedido=(TextView)findViewById(R.id.txt_pedido);
        txt_total=(TextView)findViewById(R.id.txt_total);
        Bundle bundle= getIntent().getExtras();
        txt_pedido.setText(""+bundle.getString("pedido"));
        btn_regresar=(Button) findViewById(R.id.btn_regresar);
        Double total=Double.parseDouble(bundle.getString("pedido"))*5;
        txt_total.setText(""+total);

        btn_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Factura.this,MainActivity.class));
            }
        });
    }
}

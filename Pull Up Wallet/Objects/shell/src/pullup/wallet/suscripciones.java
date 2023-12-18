
package pullup.wallet;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class suscripciones implements IRemote{
	public static suscripciones mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public suscripciones() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("suscripciones"), "pullup.wallet.suscripciones");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, suscripciones.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _alturadispositivo = RemoteObject.createImmutable(0);
public static RemoteObject _anchodispositivo = RemoteObject.createImmutable(0);
public static RemoteObject _nregistros = RemoteObject.createImmutable(0);
public static RemoteObject _relaciones = null;
public static RemoteObject _arraypnlsopciones = null;
public static RemoteObject _btnmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblcontornoboton = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _pnlnavinferior = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _pnldeslizable = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _svpantalla = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
public static RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
public static RemoteObject _cvstest = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _bmptest = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static pullup.wallet.main _main = null;
public static pullup.wallet.starter _starter = null;
public static pullup.wallet.tutorial _tutorial = null;
public static pullup.wallet.diapositivas _diapositivas = null;
public static pullup.wallet.editargasto _editargasto = null;
public static pullup.wallet.editaringresorecurrente _editaringresorecurrente = null;
public static pullup.wallet.editaringresounico _editaringresounico = null;
public static pullup.wallet.editarmetaahorro _editarmetaahorro = null;
public static pullup.wallet.editarsuscripcion _editarsuscripcion = null;
public static pullup.wallet.gastos _gastos = null;
public static pullup.wallet.historiales _historiales = null;
public static pullup.wallet.ingresosrecurrentes _ingresosrecurrentes = null;
public static pullup.wallet.ingresosunicos _ingresosunicos = null;
public static pullup.wallet.metasdeahorro _metasdeahorro = null;
public static pullup.wallet.registrargasto _registrargasto = null;
public static pullup.wallet.registraringreso _registraringreso = null;
public static pullup.wallet.registrarmetaahorro _registrarmetaahorro = null;
public static pullup.wallet.registrarsuscripcion _registrarsuscripcion = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",suscripciones.mostCurrent._activity,"alturaDispositivo",suscripciones._alturadispositivo,"anchoDispositivo",suscripciones._anchodispositivo,"arrayPnlsOpciones",suscripciones.mostCurrent._arraypnlsopciones,"bmpTest",suscripciones.mostCurrent._bmptest,"btnMenu",suscripciones.mostCurrent._btnmenu,"cs",suscripciones.mostCurrent._cs,"cur",suscripciones.mostCurrent._cur,"cvsTest",suscripciones.mostCurrent._cvstest,"Diapositivas",Debug.moduleToString(pullup.wallet.diapositivas.class),"editarGasto",Debug.moduleToString(pullup.wallet.editargasto.class),"editarIngresoRecurrente",Debug.moduleToString(pullup.wallet.editaringresorecurrente.class),"editarIngresoUnico",Debug.moduleToString(pullup.wallet.editaringresounico.class),"editarMetaAhorro",Debug.moduleToString(pullup.wallet.editarmetaahorro.class),"editarSuscripcion",Debug.moduleToString(pullup.wallet.editarsuscripcion.class),"Gastos",Debug.moduleToString(pullup.wallet.gastos.class),"Historiales",Debug.moduleToString(pullup.wallet.historiales.class),"IngresosRecurrentes",Debug.moduleToString(pullup.wallet.ingresosrecurrentes.class),"IngresosUnicos",Debug.moduleToString(pullup.wallet.ingresosunicos.class),"lblContornoBoton",suscripciones.mostCurrent._lblcontornoboton,"Main",Debug.moduleToString(pullup.wallet.main.class),"MetasDeAhorro",Debug.moduleToString(pullup.wallet.metasdeahorro.class),"nRegistros",suscripciones._nregistros,"pnlDeslizable",suscripciones.mostCurrent._pnldeslizable,"pnlNavInferior",suscripciones.mostCurrent._pnlnavinferior,"registrarGasto",Debug.moduleToString(pullup.wallet.registrargasto.class),"registrarIngreso",Debug.moduleToString(pullup.wallet.registraringreso.class),"registrarMetaAhorro",Debug.moduleToString(pullup.wallet.registrarmetaahorro.class),"registrarSuscripcion",Debug.moduleToString(pullup.wallet.registrarsuscripcion.class),"Relaciones",suscripciones.mostCurrent._relaciones,"sql",suscripciones._sql,"Starter",Debug.moduleToString(pullup.wallet.starter.class),"svPantalla",suscripciones.mostCurrent._svpantalla,"Tutorial",Debug.moduleToString(pullup.wallet.tutorial.class)};
}
}
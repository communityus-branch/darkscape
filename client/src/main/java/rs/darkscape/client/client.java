package rs.darkscape.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;
import rs.darkscape.client.net.AbstractSocket;
import rs.darkscape.client.sign.Task;
import rs.darkscape.client.util.ByteArrayPool;
import rs.darkscape.client.util.Time;

public final class client extends class47 implements class288 {

  @ObfuscatedName("ek")
  @ObfuscatedSignature(
      signature = "Lcf;"
  )
  public static final class87 field626;
  @ObfuscatedName("fw")
  static final int[] field846;
  @ObfuscatedName("jp")
  static final int[] field703;
  @ObfuscatedName("rl")
  @ObfuscatedSignature(
      signature = "Lbz;"
  )
  static final class59 field849;
  @ObfuscatedName("bk")
  @ObfuscatedGetter(
      intValue = -33369237
  )
  public static int field581 = 1;
  @ObfuscatedName("bh")
  public static boolean field668 = false;
  @ObfuscatedName("lm")
  @ObfuscatedGetter(
      intValue = 1090303845
  )
  public static int field747;
  @ObfuscatedName("ro")
  @ObfuscatedGetter(
      intValue = -1150401375
  )
  public static int field650;
  @ObfuscatedName("dn")
  @ObfuscatedSignature(
      signature = "Lic;"
  )
  static class249 field854;
  @ObfuscatedName("ez")
  @ObfuscatedGetter(
      intValue = 2118745709
  )
  static int field754;
  @ObfuscatedName("ag")
  static boolean field580 = true;
  @ObfuscatedName("bp")
  @ObfuscatedGetter(
      intValue = -295549115
  )
  static int field632 = 0;
  @ObfuscatedName("bj")
  @ObfuscatedGetter(
      intValue = 1999635431
  )
  static int field777 = 0;
  @ObfuscatedName("bz")
  static boolean field585 = false;
  @ObfuscatedName("bu")
  @ObfuscatedGetter(
      intValue = -2057800147
  )
  static int field827 = 0;
  @ObfuscatedName("bn")
  @ObfuscatedGetter(
      intValue = -1305395647
  )
  static int field587 = -1;
  @ObfuscatedName("bb")
  static boolean field588 = false;
  @ObfuscatedName("bx")
  @ObfuscatedGetter(
      intValue = 1544810619
  )
  static int state = 0;
  @ObfuscatedName("bc")
  static boolean field625 = true;
  @ObfuscatedName("bs")
  @ObfuscatedGetter(
      intValue = 181352847
  )
  static int field591 = 0;
  @ObfuscatedName("be")
  @ObfuscatedGetter(
      longValue = 2452580139566453107L
  )
  static long field592 = -1L;
  @ObfuscatedName("bv")
  @ObfuscatedGetter(
      intValue = -381181903
  )
  static int field593 = -1;
  @ObfuscatedName("br")
  @ObfuscatedGetter(
      intValue = -1985172807
  )
  static int field594 = -1;
  @ObfuscatedName("bd")
  @ObfuscatedGetter(
      intValue = -1157772735
  )
  static int field595 = -1;
  @ObfuscatedName("bw")
  static boolean field847 = true;
  @ObfuscatedName("bf")
  static boolean field597 = false;
  @ObfuscatedName("bt")
  @ObfuscatedGetter(
      intValue = -785638907
  )
  static int field598 = 0;
  @ObfuscatedName("bm")
  @ObfuscatedGetter(
      intValue = -940910327
  )
  static int field599 = 0;
  @ObfuscatedName("cy")
  @ObfuscatedGetter(
      intValue = 487683979
  )
  static int field600 = 0;
  @ObfuscatedName("cd")
  @ObfuscatedGetter(
      intValue = 348104391
  )
  static int field579 = 0;
  @ObfuscatedName("cb")
  @ObfuscatedGetter(
      intValue = 304122621
  )
  static int field602 = 0;
  @ObfuscatedName("co")
  @ObfuscatedGetter(
      intValue = -1345747809
  )
  static int field818 = 0;
  @ObfuscatedName("cq")
  @ObfuscatedGetter(
      intValue = -1571130755
  )
  static int field604 = 0;
  @ObfuscatedName("cl")
  @ObfuscatedGetter(
      intValue = -169903469
  )
  static int field605 = 0;
  @ObfuscatedName("ce")
  @ObfuscatedGetter(
      intValue = 1735835325
  )
  static int field637 = 0;
  @ObfuscatedName("cw")
  @ObfuscatedSignature(
      signature = "Lbm;"
  )
  static class77 field607;
  @ObfuscatedName("cf")
  @ObfuscatedSignature(
      signature = "Lbm;"
  )
  static class77 field780;
  @ObfuscatedName("cr")
  @ObfuscatedGetter(
      intValue = 1766129571
  )
  static int field609;
  @ObfuscatedName("cs")
  @ObfuscatedGetter(
      intValue = -1705892515
  )
  static int archiveConnectStage;
  @ObfuscatedName("ct")
  @ObfuscatedGetter(
      intValue = -1149880601
  )
  static int field768;
  @ObfuscatedName("dp")
  @ObfuscatedGetter(
      intValue = 855035607
  )
  static int field614;
  @ObfuscatedName("db")
  @ObfuscatedGetter(
      intValue = 906778345
  )
  static int loginStage;
  @ObfuscatedName("dq")
  @ObfuscatedGetter(
      intValue = 350834505
  )
  static int field616;
  @ObfuscatedName("dx")
  @ObfuscatedGetter(
      intValue = -1184123167
  )
  static int field617;
  @ObfuscatedName("du")
  @ObfuscatedGetter(
      intValue = -1529742153
  )
  static int transferTime;
  @ObfuscatedName("da")
  @ObfuscatedSignature(
      signature = "Let;"
  )
  static class146 field619;
  @ObfuscatedName("di")
  static byte[] field620;
  @ObfuscatedName("df")
  @ObfuscatedSignature(
      signature = "[Lbr;"
  )
  static class72[] field843;
  @ObfuscatedName("dr")
  @ObfuscatedGetter(
      intValue = -931637927
  )
  static int field622;
  @ObfuscatedName("dj")
  static int[] field639;
  @ObfuscatedName("ew")
  @ObfuscatedGetter(
      intValue = -1812959769
  )
  static int field624;
  @ObfuscatedName("es")
  static int[] field666;
  @ObfuscatedName("eh")
  @ObfuscatedGetter(
      intValue = -872392001
  )
  static int field627;
  @ObfuscatedName("ey")
  static boolean field756;
  @ObfuscatedName("ep")
  static boolean useAsyncSockets;
  @ObfuscatedName("ec")
  @ObfuscatedSignature(
      signature = "Ljb;"
  )
  static class280 field804;
  @ObfuscatedName("eb")
  static java.util.HashMap field631;
  @ObfuscatedName("en")
  @ObfuscatedGetter(
      intValue = -1718380447
  )
  static int field633;
  @ObfuscatedName("ee")
  @ObfuscatedGetter(
      intValue = -1158743607
  )
  static int field634;
  @ObfuscatedName("ev")
  @ObfuscatedGetter(
      intValue = 2017775761
  )
  static int field635;
  @ObfuscatedName("ef")
  @ObfuscatedGetter(
      intValue = 1254534349
  )
  static int field636;
  @ObfuscatedName("fp")
  @ObfuscatedGetter(
      intValue = -757062227
  )
  static int field751;
  @ObfuscatedName("w")
  @ObfuscatedSignature(
      signature = "[Lfk;"
  )
  static class164[] field642;
  @ObfuscatedName("fk")
  static boolean field759;
  @ObfuscatedName("fh")
  static int[][][] field645;
  @ObfuscatedName("fi")
  @ObfuscatedGetter(
      intValue = -366074461
  )
  static int field700;
  @ObfuscatedName("fb")
  @ObfuscatedGetter(
      intValue = -1770894231
  )
  static int field643;
  @ObfuscatedName("gk")
  @ObfuscatedGetter(
      intValue = -1167871243
  )
  static int field584;
  @ObfuscatedName("gg")
  @ObfuscatedGetter(
      intValue = -1584882163
  )
  static int field836;
  @ObfuscatedName("gp")
  @ObfuscatedGetter(
      intValue = 480766297
  )
  static int field646;
  @ObfuscatedName("ge")
  static boolean field746;
  @ObfuscatedName("gv")
  @ObfuscatedGetter(
      intValue = -1967538949
  )
  static int field660;
  @ObfuscatedName("go")
  @ObfuscatedGetter(
      intValue = -873734229
  )
  static int field649;
  @ObfuscatedName("gd")
  @ObfuscatedGetter(
      intValue = -956184717
  )
  static int field717;
  @ObfuscatedName("gq")
  @ObfuscatedGetter(
      intValue = 697061695
  )
  static int field608;
  @ObfuscatedName("gu")
  @ObfuscatedGetter(
      intValue = -1956032167
  )
  static int field652;
  @ObfuscatedName("gh")
  @ObfuscatedGetter(
      intValue = 555568127
  )
  static int field653;
  @ObfuscatedName("gm")
  @ObfuscatedGetter(
      intValue = 1836032443
  )
  static int field654;
  @ObfuscatedName("gj")
  @ObfuscatedGetter(
      intValue = 2077901199
  )
  static int field655;
  @ObfuscatedName("gl")
  @ObfuscatedGetter(
      intValue = -2071897465
  )
  static int field644;
  @ObfuscatedName("gn")
  @ObfuscatedGetter(
      intValue = -588909329
  )
  static int field657;
  @ObfuscatedName("gw")
  @ObfuscatedGetter(
      intValue = -1066346821
  )
  static int field613;
  @ObfuscatedName("gf")
  @ObfuscatedGetter(
      intValue = 170615499
  )
  static int field659;
  @ObfuscatedName("hk")
  @ObfuscatedGetter(
      intValue = 980219711
  )
  static int field750;
  @ObfuscatedName("hf")
  @ObfuscatedGetter(
      intValue = -1328369009
  )
  static int field661;
  @ObfuscatedName("hu")
  @ObfuscatedGetter(
      intValue = 1143307061
  )
  static int field853;
  @ObfuscatedName("hh")
  static boolean field663;
  @ObfuscatedName("hw")
  @ObfuscatedGetter(
      intValue = -1162289797
  )
  static int field664;
  @ObfuscatedName("hc")
  static boolean field807;
  @ObfuscatedName("hj")
  @ObfuscatedGetter(
      intValue = 1345648571
  )
  static int field738;
  @ObfuscatedName("ho")
  @ObfuscatedGetter(
      intValue = -351366969
  )
  static int field667;
  @ObfuscatedName("hm")
  @ObfuscatedGetter(
      intValue = 1968908975
  )
  static int field648;
  @ObfuscatedName("hg")
  static int[] field669;
  @ObfuscatedName("hn")
  static int[] field670;
  @ObfuscatedName("he")
  static int[] field671;
  @ObfuscatedName("hx")
  static int[] field672;
  @ObfuscatedName("hz")
  static int[] field673;
  @ObfuscatedName("hq")
  static int[] field674;
  @ObfuscatedName("hv")
  static int[] field675;
  @ObfuscatedName("hy")
  static String[] field721;
  @ObfuscatedName("ha")
  static int[][] field761;
  @ObfuscatedName("hd")
  @ObfuscatedGetter(
      intValue = -1388927477
  )
  static int field687;
  @ObfuscatedName("hr")
  @ObfuscatedGetter(
      intValue = -750974575
  )
  static int field679;
  @ObfuscatedName("hs")
  @ObfuscatedGetter(
      intValue = 43380069
  )
  static int field680;
  @ObfuscatedName("hi")
  @ObfuscatedGetter(
      intValue = 693082693
  )
  static int field681;
  @ObfuscatedName("hb")
  @ObfuscatedGetter(
      intValue = -24885111
  )
  static int field682;
  @ObfuscatedName("ht")
  @ObfuscatedGetter(
      intValue = 1433814191
  )
  static int field803;
  @ObfuscatedName("hl")
  @ObfuscatedGetter(
      intValue = 1652514069
  )
  static int field684;
  @ObfuscatedName("ih")
  static boolean field621;
  @ObfuscatedName("ik")
  @ObfuscatedGetter(
      intValue = -622016843
  )
  static int field686;
  @ObfuscatedName("im")
  @ObfuscatedGetter(
      intValue = -956121107
  )
  static int field582;
  @ObfuscatedName("if")
  @ObfuscatedGetter(
      intValue = -585352053
  )
  static int field688;
  @ObfuscatedName("id")
  @ObfuscatedGetter(
      intValue = 152338269
  )
  static int field678;
  @ObfuscatedName("iw")
  @ObfuscatedGetter(
      intValue = 552112291
  )
  static int field821;
  @ObfuscatedName("il")
  @ObfuscatedGetter(
      intValue = 1401656763
  )
  static int field691;
  @ObfuscatedName("ig")
  static boolean field689;
  @ObfuscatedName("ir")
  @ObfuscatedGetter(
      intValue = -1783112029
  )
  static int field693;
  @ObfuscatedName("iv")
  @ObfuscatedGetter(
      intValue = 478044173
  )
  static int field694;
  @ObfuscatedName("ia")
  static boolean field677;
  @ObfuscatedName("is")
  @ObfuscatedSignature(
      signature = "[Lbu;"
  )
  static class60[] field610;
  @ObfuscatedName("ie")
  @ObfuscatedGetter(
      intValue = -191538519
  )
  static int field628;
  @ObfuscatedName("io")
  @ObfuscatedGetter(
      intValue = 886576793
  )
  static int field698;
  @ObfuscatedName("ib")
  static boolean field699;
  @ObfuscatedName("jl")
  @ObfuscatedGetter(
      intValue = -387109961
  )
  static int field658;
  @ObfuscatedName("jo")
  @ObfuscatedGetter(
      intValue = 668394239
  )
  static int field701;
  @ObfuscatedName("ji")
  static int[] field702;
  @ObfuscatedName("jj")
  static String[] field704;
  @ObfuscatedName("jt")
  static boolean[] field709;
  @ObfuscatedName("jd")
  static int[] field706;
  @ObfuscatedName("jq")
  @ObfuscatedGetter(
      intValue = 1859815185
  )
  static int field707;
  @ObfuscatedName("jv")
  @ObfuscatedSignature(
      signature = "[[[Lgn;"
  )
  static Deque[][][] field708;
  @ObfuscatedName("jn")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field714;
  @ObfuscatedName("jc")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field710;
  @ObfuscatedName("js")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field711;
  @ObfuscatedName("jm")
  static int[] field712;
  @ObfuscatedName("jw")
  static int[] field713;
  @ObfuscatedName("jg")
  static int[] field640;
  @ObfuscatedName("jr")
  @ObfuscatedGetter(
      intValue = 19997195
  )
  static int field715;
  @ObfuscatedName("jb")
  static boolean field716;
  @ObfuscatedName("kx")
  @ObfuscatedGetter(
      intValue = -1800746037
  )
  static int field771;
  @ObfuscatedName("kz")
  static int[] field718;
  @ObfuscatedName("ke")
  static int[] field851;
  @ObfuscatedName("kd")
  static int[] field720;
  @ObfuscatedName("kf")
  static int[] field794;
  @ObfuscatedName("km")
  static String[] field735;
  @ObfuscatedName("kt")
  static String[] field740;
  @ObfuscatedName("kn")
  static boolean[] field590;
  @ObfuscatedName("ky")
  static boolean field725;
  @ObfuscatedName("kv")
  static boolean field726;
  @ObfuscatedName("ka")
  static boolean field727;
  @ObfuscatedName("kj")
  static boolean field728;
  @ObfuscatedName("kk")
  @ObfuscatedGetter(
      intValue = -1794768613
  )
  static int field729;
  @ObfuscatedName("ko")
  @ObfuscatedGetter(
      intValue = -182788053
  )
  static int field730;
  @ObfuscatedName("kh")
  @ObfuscatedGetter(
      intValue = 1536477871
  )
  static int field623;
  @ObfuscatedName("kq")
  @ObfuscatedGetter(
      intValue = 1797385119
  )
  static int field732;
  @ObfuscatedName("ks")
  @ObfuscatedGetter(
      intValue = -676779145
  )
  static int field733;
  @ObfuscatedName("it")
  static String field734;
  @ObfuscatedName("kp")
  static boolean field785;
  @ObfuscatedName("kg")
  @ObfuscatedGetter(
      intValue = 553481877
  )
  static int field736;
  @ObfuscatedName("kw")
  @ObfuscatedGetter(
      intValue = 123296823
  )
  static int field737;
  @ObfuscatedName("lj")
  static String field612;
  @ObfuscatedName("lt")
  static String field739;
  @ObfuscatedName("lc")
  @ObfuscatedGetter(
      intValue = 312598609
  )
  static int field683;
  @ObfuscatedName("li")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  static HashMap field741;
  @ObfuscatedName("ly")
  @ObfuscatedGetter(
      intValue = 1361959827
  )
  static int field742;
  @ObfuscatedName("ll")
  @ObfuscatedGetter(
      intValue = -523545729
  )
  static int field743;
  @ObfuscatedName("lo")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field744;
  @ObfuscatedName("ld")
  @ObfuscatedGetter(
      intValue = 1214589377
  )
  static int field745;
  @ObfuscatedName("lw")
  @ObfuscatedGetter(
      intValue = 1445722035
  )
  static int field782;
  @ObfuscatedName("lr")
  @ObfuscatedGetter(
      intValue = -111588181
  )
  static int field748;
  @ObfuscatedName("lg")
  static boolean field776;
  @ObfuscatedName("lx")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field784;
  @ObfuscatedName("ln")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field583;
  @ObfuscatedName("lq")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field752;
  @ObfuscatedName("lf")
  @ObfuscatedGetter(
      intValue = -948387719
  )
  static int field753;
  @ObfuscatedName("lk")
  @ObfuscatedGetter(
      intValue = -1681068877
  )
  static int field749;
  @ObfuscatedName("lb")
  @ObfuscatedSignature(
      signature = "Lhi;"
  )
  static class230 field755;
  @ObfuscatedName("ls")
  static boolean field601;
  @ObfuscatedName("lh")
  @ObfuscatedGetter(
      intValue = 1025348025
  )
  static int field757;
  @ObfuscatedName("la")
  @ObfuscatedGetter(
      intValue = 333708905
  )
  static int field758;
  @ObfuscatedName("lz")
  static boolean field772;
  @ObfuscatedName("lu")
  @ObfuscatedGetter(
      intValue = 217795627
  )
  static int field696;
  @ObfuscatedName("le")
  @ObfuscatedGetter(
      intValue = -813390517
  )
  static int field760;
  @ObfuscatedName("lp")
  static boolean field763;
  @ObfuscatedName("mc")
  @ObfuscatedGetter(
      intValue = -1835075419
  )
  static int field801;
  @ObfuscatedName("mf")
  static int[] field764;
  @ObfuscatedName("me")
  @ObfuscatedGetter(
      intValue = -2132588897
  )
  static int field765;
  @ObfuscatedName("mi")
  static int[] field766;
  @ObfuscatedName("ml")
  @ObfuscatedGetter(
      intValue = -490868275
  )
  static int field767;
  @ObfuscatedName("mm")
  static int[] field690;
  @ObfuscatedName("mx")
  @ObfuscatedGetter(
      intValue = -103494083
  )
  static int field769;
  @ObfuscatedName("mz")
  @ObfuscatedGetter(
      intValue = -627411345
  )
  static int field770;
  @ObfuscatedName("mh")
  @ObfuscatedGetter(
      intValue = 953361159
  )
  static int field647;
  @ObfuscatedName("mv")
  @ObfuscatedGetter(
      intValue = 1778572125
  )
  static int field828;
  @ObfuscatedName("mr")
  @ObfuscatedGetter(
      intValue = 1283415023
  )
  static int field793;
  @ObfuscatedName("ms")
  @ObfuscatedGetter(
      intValue = -1120678843
  )
  static int field774;
  @ObfuscatedName("md")
  @ObfuscatedGetter(
      intValue = -59230609
  )
  static int field775;
  @ObfuscatedName("mj")
  @ObfuscatedGetter(
      intValue = -1369280353
  )
  static int field695;
  @ObfuscatedName("my")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field638;
  @ObfuscatedName("mo")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field778;
  @ObfuscatedName("mk")
  @ObfuscatedSignature(
      signature = "Lgn;"
  )
  static Deque field779;
  @ObfuscatedName("mw")
  @ObfuscatedSignature(
      signature = "Lgx;"
  )
  static HashMap field783;
  @ObfuscatedName("ny")
  @ObfuscatedGetter(
      intValue = -219746745
  )
  static int field603;
  @ObfuscatedName("nl")
  @ObfuscatedGetter(
      intValue = -1154390057
  )
  static int field830;
  @ObfuscatedName("nd")
  static boolean[] field697;
  @ObfuscatedName("nm")
  static boolean[] field788;
  @ObfuscatedName("nj")
  static boolean[] field723;
  @ObfuscatedName("np")
  static int[] field786;
  @ObfuscatedName("nx")
  static int[] field787;
  @ObfuscatedName("nt")
  static int[] field641;
  @ObfuscatedName("ne")
  static int[] field789;
  @ObfuscatedName("nv")
  @ObfuscatedGetter(
      intValue = -1675720495
  )
  static int field790;
  @ObfuscatedName("ni")
  @ObfuscatedGetter(
      longValue = -91560525507386839L
  )
  static long field791;
  @ObfuscatedName("nc")
  static boolean field792;
  @ObfuscatedName("nu")
  static int[] field731;
  @ObfuscatedName("nz")
  @ObfuscatedGetter(
      intValue = -352691883
  )
  static int field630;
  @ObfuscatedName("nq")
  @ObfuscatedGetter(
      intValue = 220873495
  )
  static int field795;
  @ObfuscatedName("nb")
  static String field796;
  @ObfuscatedName("na")
  static long[] field797;
  @ObfuscatedName("oh")
  @ObfuscatedGetter(
      intValue = 1357084131
  )
  static int field798;
  @ObfuscatedName("ob")
  @ObfuscatedGetter(
      intValue = -1015108907
  )
  static int field799;
  @ObfuscatedName("om")
  static int[] field800;
  @ObfuscatedName("ou")
  static int[] field773;
  @ObfuscatedName("ot")
  @ObfuscatedGetter(
      longValue = -4301137644112550077L
  )
  static long field722;
  @ObfuscatedName("ox")
  @ObfuscatedGetter(
      intValue = 699093181
  )
  static int field651;
  @ObfuscatedName("oy")
  @ObfuscatedGetter(
      intValue = -326408871
  )
  static int field724;
  @ObfuscatedName("od")
  static int[] field805;
  @ObfuscatedName("oc")
  static int[] field806;
  @ObfuscatedName("on")
  @ObfuscatedSignature(
      signature = "[Lll;"
  )
  static class318[] field816;
  @ObfuscatedName("or")
  @ObfuscatedGetter(
      intValue = -1068898215
  )
  static int field808;
  @ObfuscatedName("ol")
  @ObfuscatedGetter(
      intValue = 996143867
  )
  static int field809;
  @ObfuscatedName("os")
  @ObfuscatedGetter(
      intValue = -1771806997
  )
  static int field810;
  @ObfuscatedName("oi")
  @ObfuscatedGetter(
      intValue = -619539199
  )
  static int field811;
  @ObfuscatedName("ok")
  @ObfuscatedGetter(
      intValue = -1345621773
  )
  static int field812;
  @ObfuscatedName("oq")
  static boolean field813;
  @ObfuscatedName("pa")
  @ObfuscatedGetter(
      intValue = -351528433
  )
  static int field814;
  @ObfuscatedName("py")
  @ObfuscatedGetter(
      intValue = 880343809
  )
  static int field815;
  @ObfuscatedName("pm")
  @ObfuscatedGetter(
      intValue = 2142255299
  )
  static int field656;
  @ObfuscatedName("pc")
  static int[] field817;
  @ObfuscatedName("pu")
  static int[] field676;
  @ObfuscatedName("px")
  static int[] field819;
  @ObfuscatedName("pf")
  static int[] field820;
  @ObfuscatedName("pd")
  @ObfuscatedSignature(
      signature = "[Lcg;"
  )
  static class91[] field719;
  @ObfuscatedName("pb")
  static boolean field822;
  @ObfuscatedName("pe")
  static boolean[] field823;
  @ObfuscatedName("qd")
  static int[] field824;
  @ObfuscatedName("qr")
  static int[] field825;
  @ObfuscatedName("qe")
  static int[] field826;
  @ObfuscatedName("qv")
  static int[] field705;
  @ObfuscatedName("qx")
  static short field802;
  @ObfuscatedName("qc")
  static short field829;
  @ObfuscatedName("qo")
  static short field848;
  @ObfuscatedName("qz")
  static short field831;
  @ObfuscatedName("qs")
  static short field832;
  @ObfuscatedName("qt")
  static short field833;
  @ObfuscatedName("qh")
  static short field834;
  @ObfuscatedName("qj")
  static short field835;
  @ObfuscatedName("qm")
  @ObfuscatedGetter(
      intValue = -263632309
  )
  static int field762;
  @ObfuscatedName("qu")
  @ObfuscatedGetter(
      intValue = 623349101
  )
  static int field837;
  @ObfuscatedName("qq")
  @ObfuscatedGetter(
      intValue = -1734003973
  )
  static int field838;
  @ObfuscatedName("qb")
  @ObfuscatedGetter(
      intValue = 1052760379
  )
  static int field662;
  @ObfuscatedName("qg")
  @ObfuscatedGetter(
      intValue = 119023177
  )
  static int field840;
  @ObfuscatedName("qy")
  @ObfuscatedSignature(
      signature = "Lhd;"
  )
  static class227 field841;
  @ObfuscatedName("qw")
  @ObfuscatedGetter(
      intValue = -1805517847
  )
  static int field842;
  @ObfuscatedName("qk")
  @ObfuscatedGetter(
      intValue = -2039961607
  )
  static int field586;
  @ObfuscatedName("qp")
  @ObfuscatedSignature(
      signature = "[Lu;"
  )
  static class4[] field844;
  @ObfuscatedName("rr")
  @ObfuscatedSignature(
      signature = "Lbg;"
  )
  static class61 field665;
  @ObfuscatedName("rd")
  static ArrayList field781;
  @ObfuscatedName("rc")
  @ObfuscatedGetter(
      intValue = 1762427
  )
  static int field606;
  @ObfuscatedName("ru")
  static int[] field850;
  @ObfuscatedName("rg")
  static int[] field596;
  @ObfuscatedName("cv")
  @ObfuscatedSignature(
      signature = "Lee;"
  )
  static Task archiveSocketTask;
  @ObfuscatedName("cg")
  @ObfuscatedSignature(
      signature = "Lfd;"
  )
  static AbstractSocket archiveSocket;

  static {
    field607 = class77.field1074;
    field780 = class77.field1074;
    field609 = 0;
    archiveConnectStage = 0;
    field768 = 0;
    field614 = 0;
    loginStage = 0;
    field616 = 0;
    field617 = 0;
    transferTime = 0;
    field619 = class146.field1907;
    field620 = null;
    field843 = new class72[32768];
    field622 = 0;
    field639 = new int[32768];
    field624 = 0;
    field666 = new int[250];
    field626 = new class87();
    field627 = 0;
    field756 = false;
    useAsyncSockets = true;
    field804 = new class280();
    field631 = new java.util.HashMap();
    field633 = 0;
    field634 = 1;
    field635 = 0;
    field636 = 1;
    field751 = 0;
    field642 = new class164[4];
    field759 = false;
    field645 = new int[4][13][13];
    field846 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
    field700 = 0;
    field643 = 2301979;
    field584 = 5063219;
    field836 = 3353893;
    field646 = 7759444;
    field746 = false;
    field660 = 0;
    field649 = 128;
    field717 = 0;
    field608 = 0;
    field652 = 0;
    field653 = 0;
    field654 = 0;
    field655 = 0;
    field644 = 50;
    field657 = 0;
    field613 = 0;
    field659 = 0;
    field750 = 12;
    field661 = 6;
    field853 = 0;
    field663 = false;
    field664 = 0;
    field807 = false;
    field738 = 0;
    field667 = 0;
    field648 = 50;
    field669 = new int[field648];
    field670 = new int[field648];
    field671 = new int[field648];
    field672 = new int[field648];
    field673 = new int[field648];
    field674 = new int[field648];
    field675 = new int[field648];
    field721 = new String[field648];
    field761 = new int[104][104];
    field687 = 0;
    field679 = -1;
    field680 = -1;
    field681 = 0;
    field682 = 0;
    field803 = 0;
    field684 = 0;
    field621 = true;
    field686 = 0;
    field582 = 0;
    field688 = 0;
    field678 = 0;
    field821 = 0;
    field691 = 0;
    field689 = false;
    field693 = 0;
    field694 = 0;
    field677 = true;
    field610 = new class60[2048];
    field628 = -1;
    field698 = 0;
    field699 = true;
    field658 = 0;
    field701 = 0;
    field702 = new int[1000];
    field703 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
    field704 = new String[8];
    field709 = new boolean[8];
    field706 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
    field707 = -1;
    field708 = new Deque[4][104][104];
    field714 = new Deque();
    field710 = new Deque();
    field711 = new Deque();
    field712 = new int[25];
    field713 = new int[25];
    field640 = new int[25];
    field715 = 0;
    field716 = false;
    field771 = 0;
    field718 = new int[500];
    field851 = new int[500];
    field720 = new int[500];
    field794 = new int[500];
    field735 = new String[500];
    field740 = new String[500];
    field590 = new boolean[500];
    field725 = false;
    field726 = false;
    field727 = false;
    field728 = true;
    field729 = -1;
    field730 = -1;
    field623 = 0;
    field732 = 50;
    field733 = 0;
    field734 = null;
    field785 = false;
    field736 = -1;
    field737 = -1;
    field612 = null;
    field739 = null;
    field683 = -1;
    field741 = new HashMap(8);
    field742 = 0;
    field743 = 0;
    field744 = null;
    field745 = 0;
    field782 = 0;
    field747 = 0;
    field748 = -1;
    field776 = false;
    field784 = null;
    field583 = null;
    field752 = null;
    field753 = 0;
    field749 = 0;
    field755 = null;
    field601 = false;
    field757 = -1;
    field758 = -1;
    field772 = false;
    field696 = -1;
    field760 = -1;
    field763 = false;
    field801 = 1;
    field764 = new int[32];
    field765 = 0;
    field766 = new int[32];
    field767 = 0;
    field690 = new int[32];
    field769 = 0;
    field770 = 0;
    field647 = 0;
    field828 = 0;
    field793 = 0;
    field774 = 0;
    field775 = 0;
    field695 = 0;
    field638 = new Deque();
    field778 = new Deque();
    field779 = new Deque();
    field783 = new HashMap(512);
    field603 = 0;
    field830 = -2;
    field697 = new boolean[100];
    field788 = new boolean[100];
    field723 = new boolean[100];
    field786 = new int[100];
    field787 = new int[100];
    field641 = new int[100];
    field789 = new int[100];
    field790 = 0;
    field791 = 0L;
    field792 = true;
    field731 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
    field630 = 0;
    field795 = 0;
    field796 = "";
    field797 = new long[100];
    field798 = 0;
    field799 = 0;
    field800 = new int[128];
    field773 = new int[128];
    field722 = -1L;
    field651 = -1;
    field724 = 0;
    field805 = new int[1000];
    field806 = new int[1000];
    field816 = new class318[1000];
    field808 = 0;
    field809 = 0;
    field810 = 0;
    field811 = 255;
    field812 = -1;
    field813 = false;
    field814 = 127;
    field815 = 127;
    field656 = 0;
    field817 = new int[50];
    field676 = new int[50];
    field819 = new int[50];
    field820 = new int[50];
    field719 = new class91[50];
    field822 = false;
    field823 = new boolean[5];
    field824 = new int[5];
    field825 = new int[5];
    field826 = new int[5];
    field705 = new int[5];
    field802 = 256;
    field829 = 205;
    field848 = 256;
    field831 = 320;
    field832 = 1;
    field833 = 32767;
    field834 = 1;
    field835 = 32767;
    field762 = 0;
    field837 = 0;
    field838 = 0;
    field662 = 0;
    field840 = 0;
    field841 = new class227();
    field842 = -1;
    field586 = -1;
    field844 = new class4[8];
    field665 = new class61();
    field650 = -1;
    field781 = new ArrayList(10);
    field606 = 0;
    field849 = new class59();
    field850 = new int[50];
    field596 = new int[50];
  }

  @ObfuscatedName("z")
  @ObfuscatedSignature(
      signature = "(I)J",
      garbageValue = "-1512027623"
  )
  static long method1535() {
    try {
      URL url_0 = new URL(class142.method3161("services", false) + "m=accountappeal/login.ws");
      URLConnection urlconnection_1 = url_0.openConnection();
      urlconnection_1.setRequestProperty("connection", "close");
      urlconnection_1.setDoInput(true);
      urlconnection_1.setDoOutput(true);
      urlconnection_1.setConnectTimeout(5000);
      OutputStreamWriter outputstreamwriter_2 = new OutputStreamWriter(
          urlconnection_1.getOutputStream());
      outputstreamwriter_2.write("data1=req");
      outputstreamwriter_2.flush();
      InputStream inputstream_3 = urlconnection_1.getInputStream();
      Buffer class182_4 = new Buffer(new byte[1000]);

      do {
        int i_5 = inputstream_3.read(class182_4.bytes, class182_4.offset, 1000 - class182_4.offset);
        if (i_5 == -1) {
          class182_4.offset = 0;
          long long_7 = class182_4.getUInt64();
          return long_7;
        }

        class182_4.offset += i_5;
      } while (class182_4.offset < 1000);

      return 0L;
    } catch (Exception exception_9) {
      return 0L;
    }
  }

  @ObfuscatedName("hy")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "805819777"
  )
  static void method3785(int i_0, int i_1) {
    int i_2 = class293.field3660.method5517("Choose Option");

    int i_3;
    int i_4;
    for (i_3 = 0; i_3 < field771; i_3++) {
      i_4 = class293.field3660.method5517(class18.method176(i_3));
      if (i_4 > i_2) {
        i_2 = i_4;
      }
    }

    i_2 += 8;
    i_3 = field771 * 15 + 22;
    i_4 = i_0 - i_2 / 2;
    if (i_2 + i_4 > class82.field1179) {
      i_4 = class82.field1179 - i_2;
    }

    if (i_4 < 0) {
      i_4 = 0;
    }

    int i_5 = i_1;
    if (i_1 + i_3 > class243.field3138) {
      i_5 = class243.field3138 - i_3;
    }

    if (i_5 < 0) {
      i_5 = 0;
    }

    Mouse.field435 = i_4;
    class0.field1 = i_5;
    class135.field1856 = i_2;
    Temp.field1933 = field771 * 15 + 22;
  }

  @ObfuscatedName("y")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2141234055"
  )
  protected final void vmethod1144() {
    field791 = Time.currentTimeMillis() + 500L;
    this.method1145();
    if (field683 != -1) {
      this.method1151(true);
    }

  }

  @ObfuscatedName("ao")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1300111147"
  )
  protected final void initialize() {
    ByteArrayPool.initialize(new int[]{20, 260, 10000}, new int[]{1000, 100, 500});
    class26.field223 = field777 == 0 ? 43594 : field581 + 40000;
    class68.field996 = field777 == 0 ? 443 : field581 + 50000;
    class290.field3636 = class26.field223;
    class227.field2575 = class228.field2582;
    class227.field2572 = class228.field2583;
    class227.field2577 = class228.field2586;
    class227.field2578 = class228.field2585;
    class28.field249 = new class135();
    this.initializeKeyboard();
    this.initializeMouse();
    class33.mouseWheel = this.getMouseWheel();
    class34.manifests = new StorageVolume(255, class155.blocksFile, class155.manifestIndex, 500000);
    class10.field61 = class80.method1859();
    this.initializeClipboard();
    class313.method5714(this, class8.field55);
    if (field777 != 0) {
      field597 = true;
    }

    class50.method991(class10.field61.field957);
    class181.field2332 = new class67(class36.field306);
  }

  @ObfuscatedName("at")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1052023991"
  )
  protected final void update() {
    ++field591;
    this.processAssetRequests();
    class84.method1955();

    int i_1;
    try {
      if (class217.field2460 == 1) {
        i_1 = class217.field2459.method4288();
        if (i_1 > 0 && class217.field2459.method4203()) {
          i_1 -= class6.field37;
          if (i_1 < 0) {
            i_1 = 0;
          }

          class217.field2459.method4236(i_1);
        } else {
          class217.field2459.method4202();
          class217.field2459.method4200();
          if (class138.field1871 != null) {
            class217.field2460 = 2;
          } else {
            class217.field2460 = 0;
          }

          class177.field2285 = null;
          class80.field1149 = null;
        }
      }
    } catch (Exception exception_8) {
      exception_8.printStackTrace();
      class217.field2459.method4202();
      class217.field2460 = 0;
      class177.field2285 = null;
      class80.field1149 = null;
      class138.field1871 = null;
    }

    class54.method1017();
    synchronized (Keyboard.keyboard) {
      ++Keyboard.field353;
      Keyboard.field350 = Keyboard.field352;
      Keyboard.field349 = 0;
      if (Keyboard.pressedKeyWritePointer >= 0) {
        while (Keyboard.pressedKeyReadPointer != Keyboard.pressedKeyWritePointer) {
          int code = Keyboard.pressedKeyCodes[Keyboard.pressedKeyReadPointer];
          Keyboard.pressedKeyReadPointer = Keyboard.pressedKeyReadPointer + 1 & 0x7f;
          if (code < 0) {
            Keyboard.keyActive[~code] = false;
          } else {
            if (!Keyboard.keyActive[code] && Keyboard.field349 < Keyboard.field338.length - 1) {
              Keyboard.field338[++Keyboard.field349 - 1] = code;
            }

            Keyboard.keyActive[code] = true;
          }
        }
      } else {
        for (int i = 0; i < 112; i++) {
          Keyboard.keyActive[i] = false;
        }

        Keyboard.pressedKeyWritePointer = Keyboard.pressedKeyReadPointer;
      }

      if (Keyboard.field349 > 0) {
        Keyboard.field353 = 0;
      }

      Keyboard.field352 = Keyboard.typedKeyPointer;
    }

    synchronized (Mouse.mouse) {
      Mouse.field419 = Mouse.field424;
      Mouse.field425 = Mouse.field422;
      Mouse.field426 = Mouse.field423 * -1660309769;
      Mouse.field431 = Mouse.field421;
      Mouse.field432 = Mouse.field420;
      Mouse.field428 = Mouse.field434;
      Mouse.field433 = Mouse.field430;
      Mouse.field421 = 0;
    }

    if (class33.mouseWheel != null) {
      i_1 = class33.mouseWheel.get();
      field695 = i_1;
    }

    if (state == 0) {
      class29.method478();
      class43.field368.vmethod3330();

      for (i_1 = 0; i_1 < 32; i_1++) {
        class47.field394[i_1] = 0L;
      }

      for (i_1 = 0; i_1 < 32; i_1++) {
        class47.field404[i_1] = 0L;
      }

      class8.field48 = 0;
    } else if (state == 5) {
      class186.method3806(this);
      class29.method478();
      class43.field368.vmethod3330();

      for (i_1 = 0; i_1 < 32; i_1++) {
        class47.field394[i_1] = 0L;
      }

      for (i_1 = 0; i_1 < 32; i_1++) {
        class47.field404[i_1] = 0L;
      }

      class8.field48 = 0;
    } else if (state != 10 && state != 11) {
      if (state == 20) {
        class186.method3806(this);
        this.method1142();
      } else if (state == 25) {
        class15.method148();
      }
    } else {
      class186.method3806(this);
    }

    if (state == 30) {
      this.method1143();
    } else if (state == 40 || state == 45) {
      this.method1142();
    }

  }

  @ObfuscatedName("ai")
  @ObfuscatedSignature(
      signature = "(ZB)V",
      garbageValue = "0"
  )
  protected final void vmethod1137(boolean bool_1) {
    boolean bool_2 = class148.method3196();
    if (bool_2 && field813 && class28.field244 != null) {
      class28.field244.method2146();
    }

    int i_3;
    if ((state == 10 || state == 20 || state == 30) && field791 != 0L
        && Time.currentTimeMillis() > field791) {
      i_3 = field792 ? 2 : 1;
      class50.method991(i_3);
    }

    if (bool_1) {
      for (i_3 = 0; i_3 < 100; i_3++) {
        field697[i_3] = true;
      }
    }

    if (state == 0) {
      this.method796(class78.field1099, class78.field1100, bool_1);
    } else if (state == 5) {
      class273.method5227(class293.field3660, Temp.field1936, class63.field933, bool_1);
    } else if (state != 10 && state != 11) {
      if (state == 20) {
        class273.method5227(class293.field3660, Temp.field1936, class63.field933, bool_1);
      } else if (state == 25) {
        if (field751 == 1) {
          if (field633 > field634) {
            field634 = field633;
          }

          i_3 = (field634 * 50 - field633 * 50) / field634;
          class83.method1933("Loading - please wait." + "<br>" + " (" + i_3 + "%" + ")", false);
        } else if (field751 == 2) {
          if (field635 > field636) {
            field636 = field635;
          }

          i_3 = (field636 * 50 - field635 * 50) / field636 + 50;
          class83.method1933("Loading - please wait." + "<br>" + " (" + i_3 + "%" + ")", false);
        } else {
          class83.method1933("Loading - please wait.", false);
        }
      } else if (state == 30) {
        this.method1146();
      } else if (state == 40) {
        class83.method1933("Connection lost" + "<br>" + "Please wait - attempting to reestablish",
                           false);
      } else if (state == 45) {
        class83.method1933("Please wait...", false);
      }
    } else {
      class273.method5227(class293.field3660, Temp.field1936, class63.field933, bool_1);
    }

    if (state == 30 && field790 == 0 && !bool_1 && !field792) {
      for (i_3 = 0; i_3 < field603; i_3++) {
        if (field788[i_3]) {
          Temp.field2014
              .vmethod5810(field786[i_3], field787[i_3], field641[i_3], field789[i_3]);
          field788[i_3] = false;
        }
      }
    } else if (state > 0) {
      Temp.field2014.vmethod5809(0, 0);

      for (i_3 = 0; i_3 < field603; i_3++) {
        field788[i_3] = false;
      }
    }

  }

  @ObfuscatedName("ac")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2060326728"
  )
  protected final void vmethod1187() {
    if (class22.field185.method1896()) {
      class22.field185.method1893();
    }

    if (class26.field220 != null) {
      class26.field220.field529 = false;
    }

    class26.field220 = null;
    field626.method1982();
    if (Keyboard.keyboard != null) {
      Keyboard class39_1 = Keyboard.keyboard;
      synchronized (Keyboard.keyboard) {
        Keyboard.keyboard = null;
      }
    }

    class185.method3787();
    class33.mouseWheel = null;
    if (class28.field244 != null) {
      class28.field244.method2147();
    }

    if (class63.field879 != null) {
      class63.field879.method2147();
    }

    class242.method4605();
    Object object_9 = class248.field3184;
    synchronized (class248.field3184) {
      if (class248.field3179 != 0) {
        class248.field3179 = 1;

        try {
          class248.field3184.wait();
        } catch (InterruptedException ignored) {
        }
      }
    }

    if (class28.field249 != null) {
      class28.field249.method3106();
      class28.field249 = null;
    }

    try {
      class155.blocksFile.method2493();

      for (int i_4 = 0; i_4 < class148.field1913; i_4++) {
        class76.field1068[i_4].method2493();
      }

      class155.manifestIndex.method2493();
      class155.field1968.method2493();
    } catch (Exception ignored) {
    }

  }

  @ObfuscatedName("az")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-1676093665"
  )
  protected final void vmethod1132() {
  }

  public final void init() {
    try {
      if (this.method774()) {
        class279[] arr_1 = class51.method996();

        for (int i_2 = 0; i_2 < arr_1.length; i_2++) {
          class279 class279_3 = arr_1[i_2];
          String string_4 = this.getParameter(class279_3.field3591);
          if (string_4 != null) {
            switch (Integer.parseInt(class279_3.field3591)) {
              case 2:
                if (field587 == -1) {
                  field587 = Integer.parseInt(string_4);
                }
                break;
              case 3:
                field777 = Integer.parseInt(string_4);
                break;
              case 4:
                field632 = Integer.parseInt(string_4);
                break;
              case 5:
                class26.field219 = string_4;
                break;
              case 6:
                useAsyncSockets = Integer.parseInt(string_4) != 0;
                break;
              case 7:
                if (string_4.equalsIgnoreCase("true")) {
                }
                break;
              case 8:
                field827 = Integer.parseInt(string_4);
              case 9:
              case 12:
              default:
                break;
              case 10:
                Temp.field2013 = string_4;
                break;
              case 11:
                class266.field3346 = class179.method3517(Integer.parseInt(string_4));
                break;
              case 13:
                field581 = Integer.parseInt(string_4);
                break;
              case 14:
                if (string_4.equalsIgnoreCase("true")) {
                  field668 = true;
                } else {
                  field668 = false;
                }
                break;
              case 15:
                class112.field1455 = (class244) class76
                    .method1803(class191.method3870(), Integer.parseInt(string_4));
                if (class112.field1455 == class244.field3145) {
                  class36.field306 = class322.field3880;
                } else {
                  class36.field306 = class322.field3878;
                }
                break;
              case 16:
                class124.field1709 = Integer.parseInt(string_4);
            }
          }
        }

        class177.method3513();
        class54.field485 = this.getCodeBase().getHost();
        String string_7 = class266.field3346.field3135;
        byte b_8 = 0;

        try {
          class177.method3509("oldschool", string_7, b_8, 17);
        } catch (Exception exception_5) {
          class5.method65((String) null, exception_5);
        }

        Buffer.field2334 = this;
        class152.field1940 = field587;
        this.method778(765, 503, 171);
      }
    } catch (RuntimeException runtimeexception_6) {
      throw class95.method2195(runtimeexception_6, "client.init(" + ')');
    }
  }

  @ObfuscatedName("en")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1481813708"
  )
  void processAssetRequests() {
    if (state == 1000) {
      return;
    }

    long current = Time.currentTimeMillis();
    int deltaTime = (int) (current - AssetService.previousTime);
    AssetService.previousTime = current;
    if (deltaTime > 200) {
      deltaTime = 200;
    }

    AssetService.accumulatedTime += deltaTime;
    boolean connected;
    if (AssetService.field3207 == 0 && AssetService.field3198 == 0 && AssetService.field3205 == 0
        && AssetService.field3211 == 0) {
      connected = true;
    } else if (AssetService.socket == null) {
      connected = false;
    } else {
      try {
        label245:
        {
          if (AssetService.accumulatedTime > 30000) {
            throw new IOException();
          }

          RemoteArchiveRequest class246_5;

          while (AssetService.field3198 < 200 && AssetService.field3211 > 0) {
            class246_5 = (RemoteArchiveRequest) AssetService.field3212.method4018();
            Buffer buffer = new Buffer(4);
            buffer.putInt8(1);
            buffer.method3534((int) class246_5.hashKey);
            AssetService.socket.write(buffer.bytes, 0, 4);
            AssetService.field3199.put(class246_5, class246_5.hashKey);
            --AssetService.field3211;
            ++AssetService.field3198;
          }

          while (AssetService.field3207 < 200 && AssetService.field3205 > 0) {
            class246_5 = (RemoteArchiveRequest) AssetService.field3202.method3932();
            Buffer buffer = new Buffer(4);
            buffer.putInt8(0);
            buffer.method3534((int) class246_5.hashKey);
            AssetService.socket.write(buffer.bytes, 0, 4);
            class246_5.unlinkSubNode();
            AssetService.field3206.put(class246_5, class246_5.hashKey);
            --AssetService.field3205;
            ++AssetService.field3207;
          }

          for (int i_17 = 0; i_17 < 100; i_17++) {
            int i_18 = AssetService.socket.available();
            if (i_18 < 0) {
              throw new IOException();
            }

            if (i_18 == 0) {
              break;
            }

            AssetService.accumulatedTime = 0;
            byte b_7 = 0;
            if (AssetService.currentRequest == null) {
              b_7 = 8;
            } else if (AssetService.field3210 == 0) {
              b_7 = 1;
            }

            int i_8;
            int i_9;
            int i_10;
            int i_12;
            if (b_7 > 0) {
              i_8 = b_7 - AssetService.field3209.offset;
              if (i_8 > i_18) {
                i_8 = i_18;
              }

              AssetService.socket
                  .read(AssetService.field3209.bytes, AssetService.field3209.offset, i_8);
              if (AssetService.encryptionKey != 0) {
                for (i_9 = 0; i_9 < i_8; i_9++) {
                  AssetService.field3209.bytes[i_9 + AssetService.field3209.offset] ^= AssetService.encryptionKey;
                }
              }

              AssetService.field3209.offset += i_8;
              if (AssetService.field3209.offset < b_7) {
                break;
              }

              if (AssetService.currentRequest == null) {
                AssetService.field3209.offset = 0;
                i_9 = AssetService.field3209.getUInt8();
                i_10 = AssetService.field3209.getUInt16();
                int i_11 = AssetService.field3209.getUInt8();
                i_12 = AssetService.field3209.getInt32();
                long long_13 = (long) (i_10 + (i_9 << 16));
                RemoteArchiveRequest class246_15 = (RemoteArchiveRequest) AssetService.field3199.get(long_13);
                class192.field2391 = true;
                if (class246_15 == null) {
                  class246_15 = (RemoteArchiveRequest) AssetService.field3206.get(long_13);
                  class192.field2391 = false;
                }

                if (class246_15 == null) {
                  throw new IOException();
                }

                int i_16 = i_11 == 0 ? 5 : 9;
                AssetService.currentRequest = class246_15;
                class301.buffer = new Buffer(i_16 + i_12 + AssetService.currentRequest.trailerLength);
                class301.buffer.putInt8(i_11);
                class301.buffer.putInt32(i_12);
                AssetService.field3210 = 8;
                AssetService.field3209.offset = 0;
              } else if (AssetService.field3210 == 0) {
                if (AssetService.field3209.bytes[0] == -1) {
                  AssetService.field3210 = 1;
                  AssetService.field3209.offset = 0;
                } else {
                  AssetService.currentRequest = null;
                }
              }
            } else {
              i_8 = class301.buffer.bytes.length - AssetService.currentRequest.trailerLength;
              i_9 = 512 - AssetService.field3210;
              if (i_9 > i_8 - class301.buffer.offset) {
                i_9 = i_8 - class301.buffer.offset;
              }

              if (i_9 > i_18) {
                i_9 = i_18;
              }

              AssetService.socket
                  .read(class301.buffer.bytes, class301.buffer.offset, i_9);
              if (AssetService.encryptionKey != 0) {
                for (i_10 = 0; i_10 < i_9; i_10++) {
                  class301.buffer.bytes[i_10
                      + class301.buffer.offset] ^= AssetService.encryptionKey;
                }
              }

              class301.buffer.offset += i_9;
              AssetService.field3210 += i_9;
              if (i_8 == class301.buffer.offset) {
                if (AssetService.currentRequest.hashKey == 16711935L) {
                  class185.releaseManifest = class301.buffer;

                  for (i_10 = 0; i_10 < 256; i_10++) {
                    class249 class249_19 = AssetService.field3201[i_10];
                    if (class249_19 != null) {
                      class185.releaseManifest.offset = i_10 * 8 + 5;
                      i_12 = class185.releaseManifest.getInt32();
                      int i_20 = class185.releaseManifest.getInt32();
                      class249_19.method4723(i_12, i_20);
                    }
                  }
                } else {
                  AssetService.crc.reset();
                  AssetService.crc.update(class301.buffer.bytes, 0, i_8);
                  int checksum = (int) AssetService.crc.getValue();
                  if (checksum != AssetService.currentRequest.checksum) {
                    try {
                      AssetService.socket.close();
                    } catch (Exception ignored) {
                    }

                    ++AssetService.field3214;
                    AssetService.socket = null;
                    AssetService.encryptionKey = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                    connected = false;
                    break label245;
                  }

                  AssetService.field3214 = 0;
                  AssetService.field3215 = 0;
                  AssetService.currentRequest.field3155
                      .method4729((int) (AssetService.currentRequest.hashKey & 0xffffL),
                                  class301.buffer.bytes,
                                  (AssetService.currentRequest.hashKey & 0xff0000L) == 16711680L,
                                  class192.field2391);
                }

                AssetService.currentRequest.unlinkNode();
                if (class192.field2391) {
                  --AssetService.field3198;
                } else {
                  --AssetService.field3207;
                }

                AssetService.field3210 = 0;
                AssetService.currentRequest = null;
                class301.buffer = null;
              } else {
                if (AssetService.field3210 != 512) {
                  break;
                }

                AssetService.field3210 = 0;
              }
            }
          }

          connected = true;
        }
      } catch (IOException ioexception_24) {
        try {
          AssetService.socket.close();
        } catch (Exception ignored) {
        }

        ++AssetService.field3215;
        AssetService.socket = null;
        connected = false;
      }
    }

    if (!connected) {
      this.processAssetServiceConnect();
    }

  }

  @ObfuscatedName("ee")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "118360618"
  )
  void processAssetServiceConnect() {
    if (AssetService.field3214 >= 4) {
      this.method788("js5crc");
      state = 1000;
    } else {
      if (AssetService.field3215 >= 4) {
        if (state <= 5) {
          this.method788("js5io");
          state = 1000;
          return;
        }

        field768 = 3000;
        AssetService.field3215 = 3;
      }

      if (--field768 + 1 <= 0) {
        try {
          if (archiveConnectStage == 0) {
            archiveSocketTask = class47.field392.connect(class54.field485, class290.field3636);
            ++archiveConnectStage;
          }

          if (archiveConnectStage == 1) {
            if (archiveSocketTask.status == 2) {
              this.handleArchiveConnectionError(-1);
              return;
            }

            if (archiveSocketTask.status == 1) {
              ++archiveConnectStage;
            }
          }

          if (archiveConnectStage == 2) {
            if (useAsyncSockets) {
              archiveSocket = class47.createAsyncSocket((Socket) archiveSocketTask.result, 40000, 5000);
            } else {
              archiveSocket = new ReadBlockingSocket((Socket) archiveSocketTask.result, class47.field392, 5000);
            }

            Buffer buffer = new Buffer(5);
            buffer.putInt8(15);
            buffer.putInt32(171);
            archiveSocket.write(buffer.bytes, 0, 5);
            ++archiveConnectStage;
            class229.initiatedTime = Time.currentTimeMillis();
          }

          if (archiveConnectStage == 3) {
            if (archiveSocket.available() > 0 || !useAsyncSockets && state <= 5) {
              int status = archiveSocket.read();
              if (status != 0) {
                this.handleArchiveConnectionError(status);
                return;
              }

              ++archiveConnectStage;
            } else if (Time.currentTimeMillis() - class229.initiatedTime > 30000L) {
              this.handleArchiveConnectionError(-2);
              return;
            }
          }

          if (archiveConnectStage == 4) {
            class36.initializeAssetServiceConnection(archiveSocket, state > 20);
            archiveSocketTask = null;
            archiveSocket = null;
            archiveConnectStage = 0;
            field614 = 0;
          }
        } catch (IOException ex) {
          this.handleArchiveConnectionError(-3);
        }

      }
    }
  }

  @ObfuscatedName("ev")
  @ObfuscatedSignature(
      signature = "(II)V",
      garbageValue = "656785584"
  )
  void handleArchiveConnectionError(int status) {
    archiveSocketTask = null;
    archiveSocket = null;
    archiveConnectStage = 0;
    if (class290.field3636 == class26.field223) {
      class290.field3636 = class68.field996;
    } else {
      class290.field3636 = class26.field223;
    }

    ++field614;
    if (field614 >= 2 && (status == 7 || status == 9)) {
      if (state <= 5) {
        this.method788("js5connect_full");
        state = 1000;
      } else {
        field768 = 3000;
      }
    } else if (field614 >= 2 && status == 6) {
      this.method788("js5connect_outofdate");
      state = 1000;
    } else if (field614 >= 4) {
      if (state <= 5) {
        this.method788("js5connect");
        state = 1000;
      } else {
        field768 = 3000;
      }
    }

  }

  @ObfuscatedName("ft")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-2122262374"
  )
  final void method1142() {
    Object obj_1 = field626.method1983();
    PacketBuffer class189_2 = field626.field1219;

    try {
      if (loginStage == 0) {
        if (obj_1 != null) {
          ((AbstractSocket) obj_1).close();
          obj_1 = null;
        }

        class225.field2556 = null;
        field756 = false;
        field616 = 0;
        loginStage = 1;
      }

      if (loginStage == 1) {
        if (class225.field2556 == null) {
          class225.field2556 = class47.field392.connect(class54.field485, class290.field3636);
        }

        if (class225.field2556.status == 2) {
          throw new IOException();
        }

        if (class225.field2556.status == 1) {
          if (useAsyncSockets) {
            obj_1 = class47.createAsyncSocket((Socket) class225.field2556.result, 40000, 5000);
          } else {
            obj_1 = new ReadBlockingSocket((Socket) class225.field2556.result, class47.field392, 5000);
          }

          field626.method1997((AbstractSocket) obj_1);
          class225.field2556 = null;
          loginStage = 2;
        }
      }

      if (loginStage == 2) {
        field626.method1978();
        OutboundPacket class172_3 = class62.method1536();
        class172_3.buffer.putInt8(class170.field2237.field2239);
        field626.method1980(class172_3);
        field626.method1979();
        class189_2.offset = 0;
        loginStage = 3;
      }

      int i_4;
      boolean bool_13;
      if (loginStage == 3) {
        if (class28.field244 != null) {
          class28.field244.method2145();
        }

        if (class63.field879 != null) {
          class63.field879.method2145();
        }

        bool_13 = true;
        if (useAsyncSockets && !((AbstractSocket) obj_1).available(1)) {
          bool_13 = false;
        }

        if (bool_13) {
          i_4 = ((AbstractSocket) obj_1).read();
          if (class28.field244 != null) {
            class28.field244.method2145();
          }

          if (class63.field879 != null) {
            class63.field879.method2145();
          }

          if (i_4 != 0) {
            class33.method559(i_4);
            return;
          }

          class189_2.offset = 0;
          loginStage = 4;
        }
      }

      int i_28;
      if (loginStage == 4) {
        if (class189_2.offset < 8) {
          i_28 = ((AbstractSocket) obj_1).available();
          if (i_28 > 8 - class189_2.offset) {
            i_28 = 8 - class189_2.offset;
          }

          if (i_28 > 0) {
            ((AbstractSocket) obj_1).read(class189_2.bytes, class189_2.offset, i_28);
            class189_2.offset += i_28;
          }
        }

        if (class189_2.offset == 8) {
          class189_2.offset = 0;
          class221.field2535 = class189_2.getUInt64();
          loginStage = 5;
        }
      }

      int i_7;
      if (loginStage == 5) {
        field626.field1219.offset = 0;
        field626.method1978();
        PacketBuffer class189_22 = new PacketBuffer(500);
        int[] ints_14 = new int[]{(int) (Math.random() * 9.9999999E7D),
            (int) (Math.random() * 9.9999999E7D), (int) (class221.field2535 >> 32),
            (int) (class221.field2535 & ~0x0L)};
        class189_22.offset = 0;
        class189_22.putInt8(1);
        class189_22.putInt8(field619.vmethod5815());
        class189_22.putInt32(ints_14[0]);
        class189_22.putInt32(ints_14[1]);
        class189_22.putInt32(ints_14[2]);
        class189_22.putInt32(ints_14[3]);
        switch (field619.field1909) {
          case 0:
          case 1:
            class189_22.method3534(class14.field104);
            class189_22.offset += 5;
            break;
          case 2:
            class189_22.offset += 8;
            break;
          case 3:
            class189_22.putInt32(((Integer) class10.field61.field963
                .get(Integer.valueOf(class3.method35(class78.field1106)))).intValue());
            class189_22.offset += 4;
        }

        class189_22.method3699(class78.field1086);
        class189_22.method3571(class76.field1071, class76.field1069);
        OutboundPacket class172_5 = class62.method1536();
        class172_5.buffer.offset = 0;
        if (state == 40) {
          class172_5.buffer.putInt8(class170.field2238.field2239);
        } else {
          class172_5.buffer.putInt8(class170.field2235.field2239);
        }

        class172_5.buffer.method3755(0);
        int i_6 = class172_5.buffer.offset;
        class172_5.buffer.putInt32(171);
        class172_5.buffer.method3542(class189_22.bytes, 0, class189_22.offset);
        i_7 = class172_5.buffer.offset;
        class172_5.buffer.method3699(class78.field1106);
        class172_5.buffer.putInt8((field792 ? 1 : 0) << 1 | (field585 ? 1 : 0));
        class172_5.buffer.method3755(class82.field1179);
        class172_5.buffer.method3755(class243.field3138);
        PacketBuffer class189_8 = class172_5.buffer;
        if (field620 != null) {
          class189_8.method3542(field620, 0, field620.length);
        } else {
          byte[] bytes_10 = new byte[24];

          try {
            class155.field1968.method2476(0L);
            class155.field1968.method2478(bytes_10);

            int i_11;
            for (i_11 = 0; i_11 < 24 && bytes_10[i_11] == 0; i_11++) {
            }

            if (i_11 >= 24) {
              throw new IOException();
            }
          } catch (Exception exception_20) {
            for (int i_12 = 0; i_12 < 24; i_12++) {
              bytes_10[i_12] = -1;
            }
          }

          class189_8.method3542(bytes_10, 0, bytes_10.length);
        }

        class172_5.buffer.method3699(Temp.field2013);
        class172_5.buffer.putInt32(class124.field1709);
        Buffer class182_9 = new Buffer(class27.field228.method6215());
        class27.field228.encode(class182_9);
        class172_5.buffer.method3542(class182_9.bytes, 0, class182_9.bytes.length);
        class172_5.buffer.putInt8(field587);
        class172_5.buffer.putInt32(0);
        class172_5.buffer.putInt32(class77.field1079.checksum);
        class172_5.buffer.putInt32(class37.field326.checksum);
        class172_5.buffer.putInt32(class97.field1329.checksum);
        class172_5.buffer.putInt32(class224.field2548.checksum);
        class172_5.buffer.putInt32(class135.field1852.checksum);
        class172_5.buffer.putInt32(RemoteArchiveRequest.field3159.checksum);
        class172_5.buffer.putInt32(class80.field1147.checksum);
        class172_5.buffer.putInt32(class21.field179.checksum);
        class172_5.buffer.putInt32(class175.field2270.checksum);
        class172_5.buffer.putInt32(class268.field3419.checksum);
        class172_5.buffer.putInt32(class22.field183.checksum);
        class172_5.buffer.putInt32(class61.field576.checksum);
        class172_5.buffer.putInt32(field854.checksum);
        class172_5.buffer.putInt32(class50.field461.checksum);
        class172_5.buffer.putInt32(class59.field543.checksum);
        class172_5.buffer.putInt32(class36.field312.checksum);
        class172_5.buffer.putInt32(class24.field207.checksum);
        class172_5.buffer.method3569(ints_14, i_7, class172_5.buffer.offset);
        class172_5.buffer.method3614(class172_5.buffer.offset - i_6);
        field626.method1980(class172_5);
        field626.method1979();
        field626.field1218 = new IssacRandom(ints_14);

        for (int i_16 = 0; i_16 < 4; i_16++) {
          ints_14[i_16] += 50;
        }

        class189_2.method3836(ints_14);
        loginStage = 6;
      }

      if (loginStage == 6 && ((AbstractSocket) obj_1).available() > 0) {
        i_28 = ((AbstractSocket) obj_1).read();
        if (i_28 == 21 && state == 20) {
          loginStage = 7;
        } else if (i_28 == 2) {
          loginStage = 9;
        } else if (i_28 == 15 && state == 40) {
          field626.field1225 = -1;
          loginStage = 13;
        } else if (i_28 == 23 && field617 < 1) {
          ++field617;
          loginStage = 0;
        } else {
          if (i_28 != 29) {
            class33.method559(i_28);
            return;
          }

          loginStage = 11;
        }
      }

      if (loginStage == 7 && ((AbstractSocket) obj_1).available() > 0) {
        transferTime = (((AbstractSocket) obj_1).read() + 3) * 60;
        loginStage = 8;
      }

      if (loginStage == 8) {
        field616 = 0;
        class2.method22("You have only just left another world.",
                        "Your profile will be transferred in:", transferTime / 60 + " seconds.");
        if (--transferTime <= 0) {
          loginStage = 0;
        }

      } else {
        int i_17;
        if (loginStage == 9 && ((AbstractSocket) obj_1).available() >= 13) {
          bool_13 = ((AbstractSocket) obj_1).read() == 1;
          ((AbstractSocket) obj_1).read(class189_2.bytes, 0, 4);
          class189_2.offset = 0;
          boolean bool_24 = false;
          if (bool_13) {
            i_4 = class189_2.getEncryptedUInt8() << 24;
            i_4 |= class189_2.getEncryptedUInt8() << 16;
            i_4 |= class189_2.getEncryptedUInt8() << 8;
            i_4 |= class189_2.getEncryptedUInt8();
            i_17 = class3.method35(class78.field1106);
            if (class10.field61.field963.size() >= 10 && !class10.field61.field963
                .containsKey(Integer.valueOf(i_17))) {
              Iterator iterator_18 = class10.field61.field963.entrySet().iterator();
              iterator_18.next();
              iterator_18.remove();
            }

            class10.field61.field963.put(Integer.valueOf(i_17), Integer.valueOf(i_4));
          }

          if (class78.field1108) {
            class10.field61.field959 = class78.field1106;
          } else {
            class10.field61.field959 = null;
          }

          class54.method1018();
          field747 = ((AbstractSocket) obj_1).read();
          field776 = ((AbstractSocket) obj_1).read() == 1;
          field628 = ((AbstractSocket) obj_1).read();
          field628 <<= 8;
          field628 += ((AbstractSocket) obj_1).read();
          field698 = ((AbstractSocket) obj_1).read();
          ((AbstractSocket) obj_1).read(class189_2.bytes, 0, 1);
          class189_2.offset = 0;
          class168[] arr_26 = new class168[]{class168.field2100, class168.field2050,
              class168.field2051, class168.field2070, class168.field2053, class168.field2054,
              class168.field2055, class168.field2122, class168.field2083, class168.field2065,
              class168.field2059, class168.field2060, class168.field2061, class168.field2062,
              class168.field2063, class168.field2106, class168.field2107, class168.field2069,
              class168.field2128, class168.field2105, class168.field2116, class168.field2111,
              class168.field2071, class168.field2072, class168.field2114, class168.field2074,
              class168.field2075, class168.field2058, class168.field2077, class168.field2078,
              class168.field2131, class168.field2080, class168.field2081, class168.field2127,
              class168.field2079, class168.field2084, class168.field2085, class168.field2086,
              class168.field2087, class168.field2088, class168.field2089, class168.field2090,
              class168.field2091, class168.field2092, class168.field2093, class168.field2076,
              class168.field2095, class168.field2096, class168.field2097, class168.field2098,
              class168.field2099, class168.field2082, class168.field2101, class168.field2102,
              class168.field2094, class168.field2104, class168.field2067, class168.field2064,
              class168.field2119, class168.field2108, class168.field2109, class168.field2049,
              class168.field2068, class168.field2112, class168.field2113, class168.field2129,
              class168.field2115, class168.field2073, class168.field2117, class168.field2118,
              class168.field2124, class168.field2120, class168.field2121, class168.field2103,
              class168.field2123, class168.field2066, class168.field2125, class168.field2130,
              class168.field2126, class168.field2057, class168.field2056, class168.field2110,
              class168.field2052, class168.field2132};
          i_7 = class189_2.method3841();
          if (i_7 < 0 || i_7 >= arr_26.length) {
            throw new IOException(i_7 + " " + class189_2.offset);
          }

          field626.field1220 = arr_26[i_7];
          field626.field1225 = field626.field1220.field2134;
          ((AbstractSocket) obj_1).read(class189_2.bytes, 0, 2);
          class189_2.offset = 0;
          field626.field1225 = class189_2.getUInt16();

          try {
            class41.method702(Buffer.field2334, "zap");
          } catch (Throwable ignored) {
          }

          loginStage = 10;
        }

        if (loginStage != 10) {
          if (loginStage == 11 && ((AbstractSocket) obj_1).available() >= 2) {
            class189_2.offset = 0;
            ((AbstractSocket) obj_1).read(class189_2.bytes, 0, 2);
            class189_2.offset = 0;
            class249.field3192 = class189_2.getUInt16();
            loginStage = 12;
          }

          if (loginStage == 12 && ((AbstractSocket) obj_1).available() >= class249.field3192) {
            class189_2.offset = 0;
            ((AbstractSocket) obj_1).read(class189_2.bytes, 0, class249.field3192);
            class189_2.offset = 0;
            String string_25 = class189_2.method3738();
            String string_30 = class189_2.method3738();
            String string_27 = class189_2.method3738();
            class2.method22(string_25, string_30, string_27);
            Mouse.method947(10);
          }

          if (loginStage == 13) {
            if (field626.field1225 == -1) {
              if (((AbstractSocket) obj_1).available() < 2) {
                return;
              }

              ((AbstractSocket) obj_1).read(class189_2.bytes, 0, 2);
              class189_2.offset = 0;
              field626.field1225 = class189_2.getUInt16();
            }

            if (((AbstractSocket) obj_1).available() >= field626.field1225) {
              ((AbstractSocket) obj_1).read(class189_2.bytes, 0, field626.field1225);
              class189_2.offset = 0;
              i_28 = field626.field1225;
              field804.method5249();
              class30.method484();
              class37.method660(class189_2);
              if (i_28 != class189_2.offset) {
                throw new RuntimeException();
              }
            }
          } else {
            ++field616;
            if (field616 > 2000) {
              if (field617 < 1) {
                if (class26.field223 == class290.field3636) {
                  class290.field3636 = class68.field996;
                } else {
                  class290.field3636 = class26.field223;
                }

                ++field617;
                loginStage = 0;
              } else {
                class33.method559(-3);
              }
            }
          }
        } else {
          if (((AbstractSocket) obj_1).available() >= field626.field1225) {
            class189_2.offset = 0;
            ((AbstractSocket) obj_1).read(class189_2.bytes, 0, field626.field1225);
            field804.method5247();
            field592 = -1L;
            field595 = -1;
            class26.field220.field522 = 0;
            class18.field146 = true;
            field847 = true;
            field722 = -1L;
            class310.method5697();
            field626.method1978();
            field626.field1219.offset = 0;
            field626.field1220 = null;
            field626.field1215 = null;
            field626.field1226 = null;
            field626.field1227 = null;
            field626.field1225 = 0;
            field626.field1228 = 0;
            field598 = 0;
            field627 = 0;
            field599 = 0;
            field771 = 0;
            field716 = false;
            class80.method1866(0);
            OutboundPacket.method3456();
            field733 = 0;
            field785 = false;
            field656 = 0;
            field717 = 0;
            field655 = 0;
            class21.field175 = null;
            field810 = 0;
            field651 = -1;
            field808 = 0;
            field809 = 0;
            field607 = class77.field1074;
            field780 = class77.field1074;
            field622 = 0;
            class111.method2562();

            for (i_28 = 0; i_28 < 2048; i_28++) {
              field610[i_28] = null;
            }

            for (i_28 = 0; i_28 < 32768; i_28++) {
              field843[i_28] = null;
            }

            field707 = -1;
            field710.clear();
            field711.clear();

            for (i_28 = 0; i_28 < 4; i_28++) {
              for (i_4 = 0; i_4 < 104; i_4++) {
                for (i_17 = 0; i_17 < 104; i_17++) {
                  field708[i_28][i_4][i_17] = null;
                }
              }
            }

            field714 = new Deque();
            class181.field2332.method1628();

            for (i_28 = 0; i_28 < class254.field3232; i_28++) {
              class254 class254_29 = class63.method1549(i_28);
              if (class254_29 != null) {
                class225.field2559[i_28] = 0;
                class225.field2558[i_28] = 0;
              }
            }

            class22.field185.method1891();
            field748 = -1;
            if (field683 != -1) {
              class66.method1622(field683);
            }

            for (class55 class55_23 = (class55) field741.method4018(); class55_23 != null;
                class55_23 = (class55) field741.method4019()) {
              class20.method261(class55_23, true);
            }

            field683 = -1;
            field741 = new HashMap(8);
            field744 = null;
            field771 = 0;
            field716 = false;
            field841.method4462((int[]) null, new int[]{0, 0, 0, 0, 0}, false, -1);

            for (i_28 = 0; i_28 < 8; i_28++) {
              field704[i_28] = null;
              field709[i_28] = false;
            }

            class53.field474 = new HashMap(32);
            field625 = true;

            for (i_28 = 0; i_28 < 100; i_28++) {
              field697[i_28] = true;
            }

            class65.method1604();
            class14.field94 = null;

            for (i_28 = 0; i_28 < 8; i_28++) {
              field844[i_28] = new class4();
            }

            class19.field154 = null;
            class37.method660(class189_2);
            class27.field224 = -1;
            class51.method994(false, class189_2);
            field626.field1220 = null;
          }

        }
      }
    } catch (IOException ioexception_21) {
      if (field617 < 1) {
        if (class290.field3636 == class26.field223) {
          class290.field3636 = class68.field996;
        } else {
          class290.field3636 = class26.field223;
        }

        ++field617;
        loginStage = 0;
      } else {
        class33.method559(-2);
      }
    }
  }

  @ObfuscatedName("fw")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "51"
  )
  final void method1143() {
    if (field598 > 1) {
      --field598;
    }

    if (field627 > 0) {
      --field627;
    }

    if (field756) {
      field756 = false;
      class30.method516();
    } else {
      if (!field716) {
        class59.method1077();
      }

      int i_1;
      for (i_1 = 0; i_1 < 100 && this.method1147(field626); i_1++) {
      }

      if (state == 30) {
        while (true) {
          class312 class312_2 = (class312) class313.field3759.method4048();
          boolean bool_29;
          if (class312_2 == null) {
            bool_29 = false;
          } else {
            bool_29 = true;
          }

          int i_3;
          OutboundPacket class172_30;
          if (!bool_29) {
            OutboundPacket class172_14;
            int i_15;
            if (field804.field3597) {
              class172_14 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2201, field626.field1218);
              class172_14.buffer.putInt8(0);
              i_15 = class172_14.buffer.offset;
              field804.method5245(class172_14.buffer);
              class172_14.buffer.method3545(class172_14.buffer.offset - i_15);
              field626.method1980(class172_14);
              field804.method5248();
            }

            Object object_35 = class26.field220.field523;
            int i_4;
            int i_5;
            int i_6;
            int i_7;
            int i_8;
            int i_9;
            int i_10;
            synchronized (class26.field220.field523) {
              if (!field580) {
                class26.field220.field522 = 0;
              } else if (Mouse.field431 != 0 || class26.field220.field522 >= 40) {
                class172_30 = OutboundPacket
                    .createOutboundPacket(OutboundPacketDescriptor.field2228, field626.field1218);
                class172_30.buffer.putInt8(0);
                i_3 = class172_30.buffer.offset;
                i_4 = 0;

                for (i_5 = 0; i_5 < class26.field220.field522 && class172_30.buffer.offset
                    - i_3 < 240; i_5++) {
                  ++i_4;
                  i_6 = class26.field220.field526[i_5];
                  if (i_6 < 0) {
                    i_6 = 0;
                  } else if (i_6 > 502) {
                    i_6 = 502;
                  }

                  i_7 = class26.field220.field525[i_5];
                  if (i_7 < 0) {
                    i_7 = 0;
                  } else if (i_7 > 764) {
                    i_7 = 764;
                  }

                  i_8 = i_7 + i_6 * 765;
                  if (class26.field220.field526[i_5] == -1
                      && class26.field220.field525[i_5] == -1) {
                    i_7 = -1;
                    i_6 = -1;
                    i_8 = 524287;
                  }

                  if (i_7 == field593 && i_6 == field594) {
                    if (field595 < 2047) {
                      ++field595;
                    }
                  } else {
                    i_9 = i_7 - field593;
                    field593 = i_7;
                    i_10 = i_6 - field594;
                    field594 = i_6;
                    if (field595 < 8 && i_9 >= -32 && i_9 <= 31 && i_10 >= -32 && i_10 <= 31) {
                      i_9 += 32;
                      i_10 += 32;
                      class172_30.buffer.method3755(i_10 + (field595 << 12) + (i_9 << 6));
                      field595 = 0;
                    } else if (field595 < 8) {
                      class172_30.buffer.method3534((field595 << 19) + i_8 + 8388608);
                      field595 = 0;
                    } else {
                      class172_30.buffer.putInt32((field595 << 19) + i_8 + -1073741824);
                      field595 = 0;
                    }
                  }
                }

                class172_30.buffer.method3545(class172_30.buffer.offset - i_3);
                field626.method1980(class172_30);
                if (i_4 >= class26.field220.field522) {
                  class26.field220.field522 = 0;
                } else {
                  class26.field220.field522 -= i_4;

                  for (i_5 = 0; i_5 < class26.field220.field522; i_5++) {
                    class26.field220.field525[i_5] = class26.field220.field525[i_4 + i_5];
                    class26.field220.field526[i_5] = class26.field220.field526[i_5 + i_4];
                  }
                }
              }
            }

            OutboundPacket class172_18;
            if (Mouse.field431 == 1 || !class253.field3229 && Mouse.field431 == 4
                || Mouse.field431 == 2) {
              long long_16 = (Mouse.field433 - field592) / 50L;
              if (long_16 > 4095L) {
                long_16 = 4095L;
              }

              field592 = Mouse.field433;
              i_3 = Mouse.field428;
              if (i_3 < 0) {
                i_3 = 0;
              } else if (i_3 > class243.field3138) {
                i_3 = class243.field3138;
              }

              i_4 = Mouse.field432;
              if (i_4 < 0) {
                i_4 = 0;
              } else if (i_4 > class82.field1179) {
                i_4 = class82.field1179;
              }

              i_5 = (int) long_16;
              class172_18 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2188, field626.field1218);
              class172_18.buffer.method3755((Mouse.field431 == 2 ? 1 : 0) + (i_5 << 1));
              class172_18.buffer.method3755(i_4);
              class172_18.buffer.method3755(i_3);
              field626.method1980(class172_18);
            }

            if (Keyboard.field349 > 0) {
              class172_14 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2218, field626.field1218);
              class172_14.buffer.method3755(0);
              i_15 = class172_14.buffer.offset;
              long long_19 = Time.currentTimeMillis();

              for (i_5 = 0; i_5 < Keyboard.field349; i_5++) {
                long long_21 = long_19 - field722;
                if (long_21 > 16777215L) {
                  long_21 = 16777215L;
                }

                field722 = long_19;
                class172_14.buffer.putInt8(Keyboard.field338[i_5]);
                class172_14.buffer.method3731((int) long_21);
              }

              class172_14.buffer.method3614(class172_14.buffer.offset - i_15);
              field626.method1980(class172_14);
            }

            if (field664 > 0) {
              --field664;
            }

            if (Keyboard.keyActive[96] || Keyboard.keyActive[97] || Keyboard.keyActive[98]
                || Keyboard.keyActive[99]) {
              field807 = true;
            }

            if (field807 && field664 <= 0) {
              field664 = 20;
              field807 = false;
              class172_14 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2183, field626.field1218);
              class172_14.buffer.method3582(field649);
              class172_14.buffer.method3755(field717);
              field626.method1980(class172_14);
            }

            if (class18.field146 && !field847) {
              field847 = true;
              class172_14 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2227, field626.field1218);
              class172_14.buffer.putInt8(1);
              field626.method1980(class172_14);
            }

            if (!class18.field146 && field847) {
              field847 = false;
              class172_14 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2227, field626.field1218);
              class172_14.buffer.putInt8(0);
              field626.method1980(class172_14);
            }

            if (class53.field476 != null) {
              class53.field476.method6013();
            }

            if (class54.field489) {
              if (class14.field94 != null) {
                class14.field94.method5337();
              }

              for (i_1 = 0; i_1 < class81.field1167; i_1++) {
                class60 class60_31 = field610[class81.field1159[i_1]];
                class60_31.method1086();
              }

              class54.field489 = false;
            }

            class82.method1894();
            if (state != 30) {
              return;
            }

            for (class62 class62_37 = (class62) field714.getFirst(); class62_37 != null;
                class62_37 = (class62) field714.getNext()) {
              if (class62_37.field860 > 0) {
                --class62_37.field860;
              }

              class268 class268_23;
              boolean bool_36;
              if (class62_37.field860 == 0) {
                if (class62_37.field859 >= 0) {
                  i_3 = class62_37.field859;
                  i_4 = class62_37.field866;
                  class268_23 = SeekableFile.method2527(i_3);
                  if (i_4 == 11) {
                    i_4 = 10;
                  }

                  if (i_4 >= 5 && i_4 <= 8) {
                    i_4 = 4;
                  }

                  bool_36 = class268_23.method5048(i_4);
                  if (!bool_36) {
                    continue;
                  }
                }

                class170.method3449(class62_37.field861, class62_37.field856, class62_37.field857,
                                    class62_37.field858, class62_37.field859, class62_37.field865,
                                    class62_37.field866);
                class62_37.unlinkNode();
              } else {
                if (class62_37.field855 > 0) {
                  --class62_37.field855;
                }

                if (class62_37.field855 == 0 && class62_37.field857 >= 1 && class62_37.field858 >= 1
                    && class62_37.field857 <= 102 && class62_37.field858 <= 102) {
                  if (class62_37.field862 >= 0) {
                    i_3 = class62_37.field862;
                    i_4 = class62_37.field864;
                    class268_23 = SeekableFile.method2527(i_3);
                    if (i_4 == 11) {
                      i_4 = 10;
                    }

                    if (i_4 >= 5 && i_4 <= 8) {
                      i_4 = 4;
                    }

                    bool_36 = class268_23.method5048(i_4);
                    if (!bool_36) {
                      continue;
                    }
                  }

                  class170.method3449(class62_37.field861, class62_37.field856, class62_37.field857,
                                      class62_37.field858, class62_37.field862, class62_37.field863,
                                      class62_37.field864);
                  class62_37.field855 = -1;
                  if (class62_37.field859 == class62_37.field862 && class62_37.field859 == -1) {
                    class62_37.unlinkNode();
                  } else if (class62_37.field859 == class62_37.field862
                      && class62_37.field863 == class62_37.field865
                      && class62_37.field866 == class62_37.field864) {
                    class62_37.unlinkNode();
                  }
                }
              }
            }

            class268.method5085();
            ++field626.field1228;
            if (field626.field1228 > 750) {
              class30.method516();
              return;
            }

            i_1 = class81.field1167;
            int[] ints_32 = class81.field1159;

            for (i_3 = 0; i_3 < i_1; i_3++) {
              class60 class60_24 = field610[ints_32[i_3]];
              if (class60_24 != null) {
                class59.method1080(class60_24, 1);
              }
            }

            for (i_1 = 0; i_1 < field622; i_1++) {
              i_15 = field639[i_1];
              class72 class72_25 = field843[i_15];
              if (class72_25 != null) {
                class59.method1080(class72_25, class72_25.field1037.field3497);
              }
            }

            int[] ints_38 = class81.field1159;

            for (i_15 = 0; i_15 < class81.field1167; i_15++) {
              class60 class60_46 = field610[ints_38[i_15]];
              if (class60_46 != null && class60_46.field887 > 0) {
                --class60_46.field887;
                if (class60_46.field887 == 0) {
                  class60_46.field884 = null;
                }
              }
            }

            for (i_15 = 0; i_15 < field622; i_15++) {
              i_3 = field639[i_15];
              class72 class72_43 = field843[i_3];
              if (class72_43 != null && class72_43.field887 > 0) {
                --class72_43.field887;
                if (class72_43.field887 == 0) {
                  class72_43.field884 = null;
                }
              }
            }

            ++field700;
            if (field684 != 0) {
              field803 += 20;
              if (field803 >= 400) {
                field684 = 0;
              }
            }

            if (class240.field3096 != null) {
              ++field686;
              if (field686 >= 15) {
                class60.method1114(class240.field3096);
                class240.field3096 = null;
              }
            }

            class230 class230_39 = class143.field1897;
            class230 class230_33 = class141.field1888;
            class143.field1897 = null;
            class141.field1888 = null;
            field755 = null;
            field772 = false;
            field601 = false;
            field799 = 0;

            while (class1.method8() && field799 < 128) {
              if (field747 >= 2 && Keyboard.keyActive[82] && Temp.field2016 == 66) {
                String str_44 = "";

                class58 class58_40;
                for (Iterator iterator_41 = class83.field1181.iterator(); iterator_41.hasNext();
                    str_44 = str_44 + class58_40.field531 + ':' + class58_40.field533 + '\n') {
                  class58_40 = (class58) iterator_41.next();
                }

                Buffer.field2334.method771(str_44);
              } else if (field655 != 1 || Keyboard.field342 <= 0) {
                field773[field799] = Temp.field2016;
                field800[field799] = Keyboard.field342;
                ++field799;
              }
            }

            if (class40.method696() && Keyboard.keyActive[82] && Keyboard.keyActive[81]
                && field695 != 0) {
              i_3 = class138.field1876.field567 - field695;
              if (i_3 < 0) {
                i_3 = 0;
              } else if (i_3 > 3) {
                i_3 = 3;
              }

              if (i_3 != class138.field1876.field567) {
                class19.method197(class138.field1876.field922[0] + class62.field868,
                                  class138.field1876.field872[0] + field754, i_3, false);
              }

              field695 = 0;
            }

            if (field683 != -1) {
              i_3 = field683;
              i_4 = class82.field1179;
              i_5 = class243.field3138;
              if (class261.method4931(i_3)) {
                class12.method102(class42.field366[i_3], -1, 0, 0, i_4, i_5, 0, 0);
              }
            }

            ++field801;

            while (true) {
              class230 class230_42;
              class230 class230_47;
              class56 class56_48;
              do {
                class56_48 = (class56) field778.pollFirst();
                if (class56_48 == null) {
                  while (true) {
                    do {
                      class56_48 = (class56) field779.pollFirst();
                      if (class56_48 == null) {
                        while (true) {
                          do {
                            class56_48 = (class56) field638.pollFirst();
                            if (class56_48 == null) {
                              this.method1233();
                              class275.method5239();
                              if (field583 != null) {
                                this.method1448();
                              }

                              OutboundPacket class172_45;
                              if (class276.field3559 != null) {
                                class60.method1114(class276.field3559);
                                ++field693;
                                if (Mouse.field419 == 0) {
                                  if (field689) {
                                    if (class132.field1819 == class276.field3559
                                        && field688 != field691) {
                                      class230 class230_49 = class276.field3559;
                                      byte b_34 = 0;
                                      if (field743 == 1 && class230_49.field2609 == 206) {
                                        b_34 = 1;
                                      }

                                      if (class230_49.field2724[field691] <= 0) {
                                        b_34 = 0;
                                      }

                                      if (class140.method3150(class24.method425(class230_49))) {
                                        i_5 = field688;
                                        i_6 = field691;
                                        class230_49.field2724[i_6] = class230_49.field2724[i_5];
                                        class230_49.field2725[i_6] = class230_49.field2725[i_5];
                                        class230_49.field2724[i_5] = -1;
                                        class230_49.field2725[i_5] = 0;
                                      } else if (b_34 == 1) {
                                        i_5 = field688;
                                        i_6 = field691;

                                        while (i_6 != i_5) {
                                          if (i_5 > i_6) {
                                            class230_49.method4507(i_5 - 1, i_5);
                                            --i_5;
                                          } else if (i_5 < i_6) {
                                            class230_49.method4507(i_5 + 1, i_5);
                                            ++i_5;
                                          }
                                        }
                                      } else {
                                        class230_49.method4507(field691, field688);
                                      }

                                      class172_45 = OutboundPacket
                                          .createOutboundPacket(OutboundPacketDescriptor.field2170, field626.field1218);
                                      class172_45.buffer.method3576(b_34);
                                      class172_45.buffer.method3582(field688);
                                      class172_45.buffer
                                          .method3687(class276.field3559.field2691);
                                      class172_45.buffer.method3582(field691);
                                      field626.method1980(class172_45);
                                    }
                                  } else if (this.method1149()) {
                                    this.method1476(field678, field821);
                                  } else if (field771 > 0) {
                                    class60.method1120(field678, field821);
                                  }

                                  field686 = 10;
                                  Mouse.field431 = 0;
                                  class276.field3559 = null;
                                } else if (field693 >= 5 && (Mouse.field425 > field678 + 5
                                    || Mouse.field425 < field678 - 5
                                    || Mouse.field426 * 673804999 > field821 + 5
                                    || Mouse.field426 * 673804999 < field821 - 5)) {
                                  field689 = true;
                                }
                              }

                              if (class125.method2911()) {
                                i_3 = class125.field1772;
                                i_4 = class125.field1747;
                                class172_45 = OutboundPacket
                                    .createOutboundPacket(OutboundPacketDescriptor.field2219, field626.field1218);
                                class172_45.buffer.putInt8(5);
                                class172_45.buffer.method3755(i_3 + class62.field868);
                                class172_45.buffer.method3575(
                                    Keyboard.keyActive[82] ? (Keyboard.keyActive[81] ? 2 : 1) : 0);
                                class172_45.buffer.method3582(i_4 + field754);
                                field626.method1980(class172_45);
                                class125.method2972();
                                field681 = Mouse.field432;
                                field682 = Mouse.field428;
                                field684 = 1;
                                field803 = 0;
                                field808 = i_3;
                                field809 = i_4;
                              }

                              if (class230_39 != class143.field1897) {
                                if (class230_39 != null) {
                                  class60.method1114(class230_39);
                                }

                                if (class143.field1897 != null) {
                                  class60.method1114(class143.field1897);
                                }
                              }

                              if (class230_33 != class141.field1888 && field623 == field732) {
                                if (class230_33 != null) {
                                  class60.method1114(class230_33);
                                }

                                if (class141.field1888 != null) {
                                  class60.method1114(class141.field1888);
                                }
                              }

                              if (class141.field1888 != null) {
                                if (field623 < field732) {
                                  ++field623;
                                  if (field732 == field623) {
                                    class60.method1114(class141.field1888);
                                  }
                                }
                              } else if (field623 > 0) {
                                --field623;
                              }

                              class85.method1962();
                              if (field822) {
                                i_3 = class24.field203 * 128 + 64;
                                i_4 = class150.field1928 * 128 + 64;
                                i_5 = class27.method460(i_3, i_4, class13.field82)
                                    - class224.field2555;
                                if (BufferedFile.field1431 < i_3) {
                                  BufferedFile.field1431 =
                                      (i_3 - BufferedFile.field1431) * class84.field1197 / 1000
                                          + BufferedFile.field1431 + class245.field3154;
                                  if (BufferedFile.field1431 > i_3) {
                                    BufferedFile.field1431 = i_3;
                                  }
                                }

                                if (BufferedFile.field1431 > i_3) {
                                  BufferedFile.field1431 -= class84.field1197 * (
                                      BufferedFile.field1431 - i_3) / 1000 + class245.field3154;
                                  if (BufferedFile.field1431 < i_3) {
                                    BufferedFile.field1431 = i_3;
                                  }
                                }

                                if (class123.field1702 < i_5) {
                                  class123.field1702 =
                                      (i_5 - class123.field1702) * class84.field1197 / 1000
                                          + class123.field1702 + class245.field3154;
                                  if (class123.field1702 > i_5) {
                                    class123.field1702 = i_5;
                                  }
                                }

                                if (class123.field1702 > i_5) {
                                  class123.field1702 -=
                                      class84.field1197 * (class123.field1702 - i_5) / 1000
                                          + class245.field3154;
                                  if (class123.field1702 < i_5) {
                                    class123.field1702 = i_5;
                                  }
                                }

                                if (class226.field2563 < i_4) {
                                  class226.field2563 =
                                      (i_4 - class226.field2563) * class84.field1197 / 1000
                                          + class226.field2563 + class245.field3154;
                                  if (class226.field2563 > i_4) {
                                    class226.field2563 = i_4;
                                  }
                                }

                                if (class226.field2563 > i_4) {
                                  class226.field2563 -=
                                      class84.field1197 * (class226.field2563 - i_4) / 1000
                                          + class245.field3154;
                                  if (class226.field2563 < i_4) {
                                    class226.field2563 = i_4;
                                  }
                                }

                                i_3 = class50.field456 * 128 + 64;
                                i_4 = class237.field3082 * 128 + 64;
                                i_5 =
                                    class27.method460(i_3, i_4, class13.field82) - class11.field68;
                                i_6 = i_3 - BufferedFile.field1431;
                                i_7 = i_5 - class123.field1702;
                                i_8 = i_4 - class226.field2563;
                                i_9 = (int) Math.sqrt((double) (i_8 * i_8 + i_6 * i_6));
                                i_10 = (int) (Math.atan2((double) i_7, (double) i_9) * 325.949D)
                                    & 0x7ff;
                                int i_26 =
                                    (int) (Math.atan2((double) i_6, (double) i_8) * -325.949D)
                                        & 0x7ff;
                                if (i_10 < 128) {
                                  i_10 = 128;
                                }

                                if (i_10 > 383) {
                                  i_10 = 383;
                                }

                                if (class7.field41 < i_10) {
                                  class7.field41 =
                                      (i_10 - class7.field41) * class133.field1834 / 1000
                                          + class7.field41 + class72.field1033;
                                  if (class7.field41 > i_10) {
                                    class7.field41 = i_10;
                                  }
                                }

                                if (class7.field41 > i_10) {
                                  class7.field41 -=
                                      class133.field1834 * (class7.field41 - i_10) / 1000
                                          + class72.field1033;
                                  if (class7.field41 < i_10) {
                                    class7.field41 = i_10;
                                  }
                                }

                                int i_12 = i_26 - class85.field1201;
                                if (i_12 > 1024) {
                                  i_12 -= 2048;
                                }

                                if (i_12 < -1024) {
                                  i_12 += 2048;
                                }

                                if (i_12 > 0) {
                                  class85.field1201 =
                                      i_12 * class133.field1834 / 1000 + class85.field1201
                                          + class72.field1033;
                                  class85.field1201 &= 0x7ff;
                                }

                                if (i_12 < 0) {
                                  class85.field1201 -=
                                      -i_12 * class133.field1834 / 1000 + class72.field1033;
                                  class85.field1201 &= 0x7ff;
                                }

                                int i_13 = i_26 - class85.field1201;
                                if (i_13 > 1024) {
                                  i_13 -= 2048;
                                }

                                if (i_13 < -1024) {
                                  i_13 += 2048;
                                }

                                if (i_13 < 0 && i_12 > 0 || i_13 > 0 && i_12 < 0) {
                                  class85.field1201 = i_26;
                                }
                              }

                              for (i_3 = 0; i_3 < 5; i_3++) {
                                ++field705[i_3];
                              }

                              class22.field185.method1902();
                              i_3 = class37.method652();
                              i_4 = Keyboard.field353;
                              if (i_3 > 15000 && i_4 > 15000) {
                                field627 = 250;
                                class80.method1866(14500);
                                class172_18 = OutboundPacket
                                    .createOutboundPacket(OutboundPacketDescriptor.field2152, field626.field1218);
                                field626.method1980(class172_18);
                              }

                              class181.field2332.method1627();
                              ++field626.field1224;
                              if (field626.field1224 > 50) {
                                class172_18 = OutboundPacket
                                    .createOutboundPacket(OutboundPacketDescriptor.field2211, field626.field1218);
                                field626.method1980(class172_18);
                              }

                              try {
                                field626.method1979();
                              } catch (IOException ioexception_27) {
                                class30.method516();
                              }

                              return;
                            }

                            class230_47 = class56_48.field506;
                            if (class230_47.field2606 < 0) {
                              break;
                            }

                            class230_42 = class26.method434(class230_47.field2605);
                          } while (class230_42 == null || class230_42.field2736 == null
                              || class230_47.field2606 >= class230_42.field2736.length
                              || class230_47 != class230_42.field2736[class230_47.field2606]);

                          class68.method1696(class56_48);
                        }
                      }

                      class230_47 = class56_48.field506;
                      if (class230_47.field2606 < 0) {
                        break;
                      }

                      class230_42 = class26.method434(class230_47.field2605);
                    } while (class230_42 == null || class230_42.field2736 == null
                        || class230_47.field2606 >= class230_42.field2736.length
                        || class230_47 != class230_42.field2736[class230_47.field2606]);

                    class68.method1696(class56_48);
                  }
                }

                class230_47 = class56_48.field506;
                if (class230_47.field2606 < 0) {
                  break;
                }

                class230_42 = class26.method434(class230_47.field2605);
              } while (class230_42 == null || class230_42.field2736 == null
                  || class230_47.field2606 >= class230_42.field2736.length
                  || class230_47 != class230_42.field2736[class230_47.field2606]);

              class68.method1696(class56_48);
            }
          }

          class172_30 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2145, field626.field1218);
          class172_30.buffer.putInt8(0);
          i_3 = class172_30.buffer.offset;
          class123.method2869(class172_30.buffer);
          class172_30.buffer.method3545(class172_30.buffer.offset - i_3);
          field626.method1980(class172_30);
        }
      }
    }
  }

  @ObfuscatedName("gp")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-681857594"
  )
  void method1145() {
    int i_1 = class82.field1179;
    int i_2 = class243.field3138;
    if (super.field396 < i_1) {
      i_1 = super.field396;
    }

    if (super.field397 < i_2) {
      i_2 = super.field397;
    }

    if (class10.field61 != null) {
      try {
        client client_3 = Buffer.field2334;
        int i_4 = field792 ? 2 : 1;
        class41.method700(client_3, "resize", new Object[]{Integer.valueOf(i_4)});
      } catch (Throwable ignored) {
      }
    }

  }

  @ObfuscatedName("ge")
  @ObfuscatedSignature(
      signature = "(B)V",
      garbageValue = "0"
  )
  final void method1146() {
    if (field683 != -1) {
      class21.method270(field683);
    }

    int i_1;
    for (i_1 = 0; i_1 < field603; i_1++) {
      if (field697[i_1]) {
        field788[i_1] = true;
      }

      field723[i_1] = field697[i_1];
      field697[i_1] = false;
    }

    field830 = field591;
    field729 = -1;
    field730 = -1;
    class132.field1819 = null;
    if (field683 != -1) {
      field603 = 0;
      class35.method630(field683, 0, 0, class82.field1179, class243.field3138, 0, 0, -1);
    }

    class314.method5719();
    if (!field716) {
      if (field729 != -1) {
        class51.method997(field729, field730);
      }
    } else {
      class83.method1940();
    }

    if (field790 == 3) {
      for (i_1 = 0; i_1 < field603; i_1++) {
        if (field723[i_1]) {
          class314.method5727(field786[i_1], field787[i_1], field641[i_1], field789[i_1], 16711935,
                              128);
        } else if (field788[i_1]) {
          class314.method5727(field786[i_1], field787[i_1], field641[i_1], field789[i_1], 16711680,
                              128);
        }
      }
    }

    i_1 = class13.field82;
    int i_2 = class138.field1876.field931;
    int i_3 = class138.field1876.field881;
    int i_4 = field700;

    for (class68 class68_5 = (class68) class68.field985.getFirst(); class68_5 != null;
        class68_5 = (class68) class68.field985.getNext()) {
      if (class68_5.field987 != -1 || class68_5.field986 != null) {
        int i_6 = 0;
        if (i_2 > class68_5.field984) {
          i_6 += i_2 - class68_5.field984;
        } else if (i_2 < class68_5.field988) {
          i_6 += class68_5.field988 - i_2;
        }

        if (i_3 > class68_5.field992) {
          i_6 += i_3 - class68_5.field992;
        } else if (i_3 < class68_5.field983) {
          i_6 += class68_5.field983 - i_3;
        }

        if (i_6 - 64 <= class68_5.field991 && field815 != 0 && i_1 == class68_5.field981) {
          i_6 -= 64;
          if (i_6 < 0) {
            i_6 = 0;
          }

          int i_7 = (class68_5.field991 - i_6) * field815 / class68_5.field991;
          Object obj_10000;
          if (class68_5.field993 == null) {
            if (class68_5.field987 >= 0) {
              obj_10000 = null;
              class91 class91_8 = class91.method2071(class135.field1852, class68_5.field987, 0);
              if (class91_8 != null) {
                class93 class93_9 = class91_8.method2069().method2115(class61.field577);
                class103 class103_10 = class103.method2287(class93_9, 100, i_7);
                class103_10.method2258(-1);
                class36.field310.method2032(class103_10);
                class68_5.field993 = class103_10;
              }
            }
          } else {
            class68_5.field993.method2267(i_7);
          }

          if (class68_5.field980 == null) {
            if (class68_5.field986 != null && (class68_5.field990 -= i_4) <= 0) {
              int i_12 = (int) (Math.random() * (double) class68_5.field986.length);
              obj_10000 = null;
              class91 class91_13 = class91
                  .method2071(class135.field1852, class68_5.field986[i_12], 0);
              if (class91_13 != null) {
                class93 class93_14 = class91_13.method2069().method2115(class61.field577);
                class103 class103_11 = class103.method2287(class93_14, 100, i_7);
                class103_11.method2258(0);
                class36.field310.method2032(class103_11);
                class68_5.field980 = class103_11;
                class68_5.field990 =
                    class68_5.field989 + (int) (Math.random() * (double) (class68_5.field982
                        - class68_5.field989));
              }
            }
          } else {
            class68_5.field980.method2267(i_7);
            if (!class68_5.field980.isLinked()) {
              class68_5.field980 = null;
            }
          }
        } else {
          if (class68_5.field993 != null) {
            class36.field310.method2009(class68_5.field993);
            class68_5.field993 = null;
          }

          if (class68_5.field980 != null) {
            class36.field310.method2009(class68_5.field980);
            class68_5.field980 = null;
          }
        }
      }
    }

    field700 = 0;
  }

  @ObfuscatedName("hp")
  @ObfuscatedSignature(
      signature = "(Lcf;B)Z",
      garbageValue = "115"
  )
  final boolean method1147(class87 class87_1) {
    AbstractSocket class157_2 = class87_1.method1983();
    PacketBuffer class189_3 = class87_1.field1219;
    if (class157_2 == null) {
      return false;
    } else {
      String string_5;
      int i_6;
      try {
        if (class87_1.field1220 == null) {
          if (class87_1.field1222) {
            if (!class157_2.available(1)) {
              return false;
            }

            class157_2.read(class87_1.field1219.bytes, 0, 1);
            class87_1.field1228 = 0;
            class87_1.field1222 = false;
          }

          class189_3.offset = 0;
          if (class189_3.method3821()) {
            if (!class157_2.available(1)) {
              return false;
            }

            class157_2.read(class87_1.field1219.bytes, 1, 1);
            class87_1.field1228 = 0;
          }

          class87_1.field1222 = true;
          class168[] arr_4 = new class168[]{class168.field2100, class168.field2050,
              class168.field2051, class168.field2070, class168.field2053, class168.field2054,
              class168.field2055, class168.field2122, class168.field2083, class168.field2065,
              class168.field2059, class168.field2060, class168.field2061, class168.field2062,
              class168.field2063, class168.field2106, class168.field2107, class168.field2069,
              class168.field2128, class168.field2105, class168.field2116, class168.field2111,
              class168.field2071, class168.field2072, class168.field2114, class168.field2074,
              class168.field2075, class168.field2058, class168.field2077, class168.field2078,
              class168.field2131, class168.field2080, class168.field2081, class168.field2127,
              class168.field2079, class168.field2084, class168.field2085, class168.field2086,
              class168.field2087, class168.field2088, class168.field2089, class168.field2090,
              class168.field2091, class168.field2092, class168.field2093, class168.field2076,
              class168.field2095, class168.field2096, class168.field2097, class168.field2098,
              class168.field2099, class168.field2082, class168.field2101, class168.field2102,
              class168.field2094, class168.field2104, class168.field2067, class168.field2064,
              class168.field2119, class168.field2108, class168.field2109, class168.field2049,
              class168.field2068, class168.field2112, class168.field2113, class168.field2129,
              class168.field2115, class168.field2073, class168.field2117, class168.field2118,
              class168.field2124, class168.field2120, class168.field2121, class168.field2103,
              class168.field2123, class168.field2066, class168.field2125, class168.field2130,
              class168.field2126, class168.field2057, class168.field2056, class168.field2110,
              class168.field2052, class168.field2132};
          i_6 = class189_3.method3841();
          if (i_6 < 0 || i_6 >= arr_4.length) {
            throw new IOException(i_6 + " " + class189_3.offset);
          }

          class87_1.field1220 = arr_4[i_6];
          class87_1.field1225 = class87_1.field1220.field2134;
        }

        if (class87_1.field1225 == -1) {
          if (!class157_2.available(1)) {
            return false;
          }

          class87_1.method1983().read(class189_3.bytes, 0, 1);
          class87_1.field1225 = class189_3.bytes[0] & 0xff;
        }

        if (class87_1.field1225 == -2) {
          if (!class157_2.available(2)) {
            return false;
          }

          class87_1.method1983().read(class189_3.bytes, 0, 2);
          class189_3.offset = 0;
          class87_1.field1225 = class189_3.getUInt16();
        }

        if (!class157_2.available(class87_1.field1225)) {
          return false;
        }

        class189_3.offset = 0;
        class157_2.read(class189_3.bytes, 0, class87_1.field1225);
        class87_1.field1228 = 0;
        field804.method5244();
        class87_1.field1227 = class87_1.field1226;
        class87_1.field1226 = class87_1.field1215;
        class87_1.field1215 = class87_1.field1220;
        long long_7;
        long long_10;
        int i_13;
        int i_15;
        String string_17;
        int i_18;
        long long_20;
        String string_49;
        if (class168.field2131 == class87_1.field1220) {
          string_49 = class189_3.method3738();
          long_20 = (long) class189_3.getUInt16();
          long_7 = (long) class189_3.getUInt24();
          class242 class242_58 = (class242) class76
              .method1803(class20.method216(), class189_3.getUInt8());
          long_10 = (long_20 << 32) + long_7;
          boolean bool_60 = false;

          for (i_13 = 0; i_13 < 100; i_13++) {
            if (long_10 == field797[i_13]) {
              bool_60 = true;
              break;
            }
          }

          if (class181.field2332.method1630(new class291(string_49, class36.field306))) {
            bool_60 = true;
          }

          if (!bool_60 && field694 == 0) {
            field797[field798] = long_10;
            field798 = (field798 + 1) % 100;

            String str_14;
            try {
              i_15 = class189_3.method3562();
              if (i_15 > 32767) {
                i_15 = 32767;
              }

              byte[] bytes_62 = new byte[i_15];
              class189_3.offset += class300.field3712
                  .method3480(class189_3.bytes, class189_3.offset, bytes_62, 0, i_15);
              string_17 = class78.method1831(bytes_62, 0, i_15);
              str_14 = string_17;
            } catch (Exception exception_46) {
              str_14 = "Cabbage";
            }

            str_14 = class299.method5521(class51.method998(str_14));
            byte b_61;
            if (class242_58.field3126) {
              b_61 = 7;
            } else {
              b_61 = 3;
            }

            if (class242_58.field3128 != -1) {
              i_18 = class242_58.field3128;
              string_17 = "<img=" + i_18 + ">";
              class143.method3172(b_61, string_17 + string_49, str_14);
            } else {
              class143.method3172(b_61, string_49, str_14);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        boolean bool_64;
        if (class168.field2103 == class87_1.field1220) {
          bool_64 = class189_3.method3555();
          if (bool_64) {
            if (class21.field175 == null) {
              class21.field175 = new class251();
            }
          } else {
            class21.field175 = null;
          }

          class87_1.field1220 = null;
          return true;
        }

        int i_8;
        int i_25;
        int i_26;
        int i_27;
        long long_28;
        if (class168.field2084 == class87_1.field1220) {
          i_25 = class189_3.method3613();
          if (i_25 == 65535) {
            i_25 = -1;
          }

          i_26 = class189_3.method3609();
          i_6 = class189_3.method3770();
          i_27 = class189_3.method3646();
          if (i_27 == 65535) {
            i_27 = -1;
          }

          for (i_8 = i_25; i_8 <= i_27; i_8++) {
            long_28 = ((long) i_26 << 32) + (long) i_8;
            Node class204_59 = field783.get(long_28);
            if (class204_59 != null) {
              class204_59.unlinkNode();
            }

            field783.put(new class211(i_6), long_28);
          }

          class87_1.field1220 = null;
          return true;
        }

        class230 class230_30;
        int i_31;
        if (class168.field2071 == class87_1.field1220) {
          i_25 = class189_3.getInt32();
          i_26 = class189_3.getUInt16();
          if (i_25 < -70000) {
            i_26 += 32768;
          }

          if (i_25 >= 0) {
            class230_30 = class26.method434(i_25);
          } else {
            class230_30 = null;
          }

          for (; class189_3.offset < class87_1.field1225;
              class10.method96(i_26, i_27, i_8 - 1, i_31)) {
            i_27 = class189_3.method3562();
            i_8 = class189_3.getUInt16();
            i_31 = 0;
            if (i_8 != 0) {
              i_31 = class189_3.getUInt8();
              if (i_31 == 255) {
                i_31 = class189_3.getInt32();
              }
            }

            if (class230_30 != null && i_27 >= 0 && i_27 < class230_30.field2724.length) {
              class230_30.field2724[i_27] = i_8;
              class230_30.field2725[i_27] = i_31;
            }
          }

          if (class230_30 != null) {
            class60.method1114(class230_30);
          }

          class295.method5501();
          field766[++field767 - 1 & 0x1f] = i_26 & 0x7fff;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2108 == class87_1.field1220) {
          class226.field2568 = class189_3.getUInt8();
          class57.field524 = class189_3.method3577();

          while (class189_3.offset < class87_1.field1225) {
            i_25 = class189_3.getUInt8();
            class171[] arr_56 = new class171[]{class171.field2249, class171.field2242,
                class171.field2244, class171.field2243, class171.field2245, class171.field2246,
                class171.field2241, class171.field2248, class171.field2247, class171.field2250};
            class171 class171_70 = arr_56[i_25];
            class29.method479(class171_70);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2117 == class87_1.field1220) {
          class97.method2213();
          class87_1.field1220 = null;
          return false;
        }

        if (class168.field2100 == class87_1.field1220) {
          i_25 = class189_3.method3770();
          i_26 = class189_3.method3613();
          class230_30 = class26.method434(i_25);
          if (class230_30.field2665 != 2 || i_26 != class230_30.field2593) {
            class230_30.field2665 = 2;
            class230_30.field2593 = i_26;
            class60.method1114(class230_30);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2085 == class87_1.field1220) {
          class51.method994(false, class87_1.field1219);
          class87_1.field1220 = null;
          return true;
        }

        boolean bool_71;
        if (class168.field2116 == class87_1.field1220) {
          i_25 = class189_3.method3609();
          bool_71 = class189_3.method3607() == 1;
          class230_30 = class26.method434(i_25);
          if (bool_71 != class230_30.field2625) {
            class230_30.field2625 = bool_71;
            class60.method1114(class230_30);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2070 == class87_1.field1220) {
          string_49 = class189_3.method3738();
          Object[] arr_55 = new Object[string_49.length() + 1];

          for (i_6 = string_49.length() - 1; i_6 >= 0; --i_6) {
            if (string_49.charAt(i_6) == 115) {
              arr_55[i_6 + 1] = class189_3.method3738();
            } else {
              arr_55[i_6 + 1] = new Integer(class189_3.getInt32());
            }
          }

          arr_55[0] = new Integer(class189_3.getInt32());
          class56 class56_69 = new class56();
          class56_69.field512 = arr_55;
          class68.method1696(class56_69);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2110 == class87_1.field1220) {
          class51.method994(true, class87_1.field1219);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2121 == class87_1.field1220) {
          for (i_25 = 0; i_25 < class254.field3232; i_25++) {
            class254 class254_54 = class63.method1549(i_25);
            if (class254_54 != null) {
              class225.field2559[i_25] = 0;
              class225.field2558[i_25] = 0;
            }
          }

          class295.method5501();
          field765 += 32;
          class87_1.field1220 = null;
          return true;
        }

        long long_32;
        int i_35;
        if (class168.field2114 == class87_1.field1220) {
          string_49 = class189_3.method3738();
          long_20 = class189_3.getUInt64();
          long_7 = (long) class189_3.getUInt16();
          long_28 = (long) class189_3.getUInt24();
          class242 class242_11 = (class242) class76
              .method1803(class20.method216(), class189_3.getUInt8());
          long_32 = long_28 + (long_7 << 32);
          boolean bool_68 = false;

          for (i_15 = 0; i_15 < 100; i_15++) {
            if (long_32 == field797[i_15]) {
              bool_68 = true;
              break;
            }
          }

          if (class242_11.field3127 && class181.field2332
              .method1630(new class291(string_49, class36.field306))) {
            bool_68 = true;
          }

          if (!bool_68 && field694 == 0) {
            field797[field798] = long_32;
            field798 = (field798 + 1) % 100;

            String str_16;
            try {
              i_35 = class189_3.method3562();
              if (i_35 > 32767) {
                i_35 = 32767;
              }

              byte[] bytes_36 = new byte[i_35];
              class189_3.offset += class300.field3712
                  .method3480(class189_3.bytes, class189_3.offset, bytes_36, 0, i_35);
              String string_19 = class78.method1831(bytes_36, 0, i_35);
              str_16 = string_19;
            } catch (Exception exception_45) {
              str_16 = "Cabbage";
            }

            str_16 = class299.method5521(class51.method998(str_16));
            if (class242_11.field3128 != -1) {
              i_18 = class242_11.field3128;
              string_17 = "<img=" + i_18 + ">";
              class173.method3472(9, string_17 + string_49, str_16, OutboundPacket
                  .method3457(long_20));
            } else {
              class173.method3472(9, string_49, str_16, OutboundPacket.method3457(long_20));
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2052 == class87_1.field1220) {
          field810 = class189_3.getUInt8();
          class87_1.field1220 = null;
          return true;
        }

        String str_65;
        String string_74;
        if (class168.field2111 == class87_1.field1220) {
          i_25 = class189_3.method3562();
          bool_71 = class189_3.getUInt8() == 1;
          str_65 = "";
          boolean bool_67 = false;
          if (bool_71) {
            str_65 = class189_3.method3738();
            if (class181.field2332.method1630(new class291(str_65, class36.field306))) {
              bool_67 = true;
            }
          }

          string_74 = class189_3.method3738();
          if (!bool_67) {
            class143.method3172(i_25, str_65, string_74);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2126 == class87_1.field1220) {
          i_25 = class189_3.getUInt16();
          i_26 = class189_3.getUInt8();
          i_6 = class189_3.getUInt16();
          if (field814 != 0 && i_26 != 0 && field656 < 50) {
            field817[field656] = i_25;
            field676[field656] = i_26;
            field819[field656] = i_6;
            field719[field656] = null;
            field820[field656] = 0;
            ++field656;
          }

          class87_1.field1220 = null;
          return true;
        }

        int i_38;
        if (class168.field2097 == class87_1.field1220) {
          field822 = true;
          class50.field456 = class189_3.getUInt8();
          class237.field3082 = class189_3.getUInt8();
          class11.field68 = class189_3.getUInt16();
          class72.field1033 = class189_3.getUInt8();
          class133.field1834 = class189_3.getUInt8();
          if (class133.field1834 >= 100) {
            i_25 = class50.field456 * 128 + 64;
            i_26 = class237.field3082 * 128 + 64;
            i_6 = class27.method460(i_25, i_26, class13.field82) - class11.field68;
            i_27 = i_25 - BufferedFile.field1431;
            i_8 = i_6 - class123.field1702;
            i_31 = i_26 - class226.field2563;
            i_38 = (int) Math.sqrt((double) (i_31 * i_31 + i_27 * i_27));
            class7.field41 = (int) (Math.atan2((double) i_8, (double) i_38) * 325.949D) & 0x7ff;
            class85.field1201 =
                (int) (Math.atan2((double) i_27, (double) i_31) * -325.949D) & 0x7ff;
            if (class7.field41 < 128) {
              class7.field41 = 128;
            }

            if (class7.field41 > 383) {
              class7.field41 = 383;
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2066 == class87_1.field1220) {
          class29.method479(class171.field2242);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2067 == class87_1.field1220) {
          class216.method4179(class189_3, class87_1.field1225);
          class97.method2215();
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2061 == class87_1.field1220) {
          class29.method479(class171.field2248);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2056 == class87_1.field1220) {
          class57.field524 = class189_3.method3765();
          class226.field2568 = class189_3.method3577();

          for (i_25 = class57.field524; i_25 < class57.field524 + 8; i_25++) {
            for (i_26 = class226.field2568; i_26 < class226.field2568 + 8; i_26++) {
              if (field708[class13.field82][i_25][i_26] != null) {
                field708[class13.field82][i_25][i_26] = null;
                class253.method4808(i_25, i_26);
              }
            }
          }

          for (class62 class62_51 = (class62) field714.getFirst(); class62_51 != null;
              class62_51 = (class62) field714.getNext()) {
            if (class62_51.field857 >= class57.field524
                && class62_51.field857 < class57.field524 + 8
                && class62_51.field858 >= class226.field2568
                && class62_51.field858 < class226.field2568 + 8
                && class62_51.field861 == class13.field82) {
              class62_51.field860 = 0;
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2049 == class87_1.field1220) {
          class29.method479(class171.field2249);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2118 == class87_1.field1220) {
          i_25 = class189_3.getUInt8();
          i_26 = class189_3.getUInt8();
          i_6 = class189_3.getUInt8();
          i_27 = class189_3.getUInt8();
          field823[i_25] = true;
          field824[i_25] = i_26;
          field825[i_25] = i_6;
          field826[i_25] = i_27;
          field705[i_25] = 0;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2069 == class87_1.field1220) {
          i_25 = class189_3.method3765();
          i_26 = class189_3.method3607();
          str_65 = class189_3.method3738();
          if (i_26 >= 1 && i_26 <= 8) {
            if (str_65.equalsIgnoreCase("null")) {
              str_65 = null;
            }

            field704[i_26 - 1] = str_65;
            field709[i_26 - 1] = i_25 == 0;
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2105 == class87_1.field1220) {
          class29.method479(class171.field2244);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2092 == class87_1.field1220) {
          class29.method479(class171.field2250);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2075 == class87_1.field1220) {
          field808 = class189_3.getUInt8();
          if (field808 == 255) {
            field808 = 0;
          }

          field809 = class189_3.getUInt8();
          if (field809 == 255) {
            field809 = 0;
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2122 == class87_1.field1220) {
          i_25 = class189_3.getInt32();
          i_26 = class189_3.getUInt16();
          if (i_25 < -70000) {
            i_26 += 32768;
          }

          if (i_25 >= 0) {
            class230_30 = class26.method434(i_25);
          } else {
            class230_30 = null;
          }

          if (class230_30 != null) {
            for (i_27 = 0; i_27 < class230_30.field2724.length; i_27++) {
              class230_30.field2724[i_27] = 0;
              class230_30.field2725[i_27] = 0;
            }
          }

          class121.method2782(i_26);
          i_27 = class189_3.getUInt16();

          for (i_8 = 0; i_8 < i_27; i_8++) {
            i_31 = class189_3.getUInt8();
            if (i_31 == 255) {
              i_31 = class189_3.method3609();
            }

            i_38 = class189_3.getUInt16();
            if (class230_30 != null && i_8 < class230_30.field2724.length) {
              class230_30.field2724[i_8] = i_38;
              class230_30.field2725[i_8] = i_31;
            }

            class10.method96(i_26, i_8, i_38 - 1, i_31);
          }

          if (class230_30 != null) {
            class60.method1114(class230_30);
          }

          class295.method5501();
          field766[++field767 - 1 & 0x1f] = i_26 & 0x7fff;
          class87_1.field1220 = null;
          return true;
        }

        class230 class230_73;
        if (class168.field2101 == class87_1.field1220) {
          i_25 = class189_3.method3770();
          i_26 = class189_3.getUInt16();
          i_6 = class189_3.method3646();
          i_27 = class189_3.method3585();
          class230_73 = class26.method434(i_25);
          if (i_27 != class230_73.field2656 || i_26 != class230_73.field2657
              || i_6 != class230_73.field2704) {
            class230_73.field2656 = i_27;
            class230_73.field2657 = i_26;
            class230_73.field2704 = i_6;
            class60.method1114(class230_73);
          }

          class87_1.field1220 = null;
          return true;
        }

        class230 class230_77;
        if (class168.field2090 == class87_1.field1220) {
          i_25 = class189_3.method3551();
          i_26 = class189_3.method3595();
          i_6 = class189_3.method3533();
          class230_77 = class26.method434(i_26);
          if (i_6 != class230_77.field2607 || i_25 != class230_77.field2615
              || class230_77.field2610 != 0 || class230_77.field2611 != 0) {
            class230_77.field2607 = i_6;
            class230_77.field2615 = i_25;
            class230_77.field2610 = 0;
            class230_77.field2611 = 0;
            class60.method1114(class230_77);
            this.method1152(class230_77);
            if (class230_77.field2721 == 0) {
              Temp.method3388(class42.field366[i_26 >> 16], class230_77, false);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2112 == class87_1.field1220) {
          class189_3.offset += 28;
          if (class189_3.method3756()) {
            class175.method3487(class189_3, class189_3.offset - 28);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2054 == class87_1.field1220) {
          field598 = class189_3.method3585() * 30;
          field775 = field801;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2094 == class87_1.field1220) {
          i_25 = class189_3.method3613();
          if (i_25 == 65535) {
            i_25 = -1;
          }

          i_26 = class189_3.getInt32();
          i_6 = class189_3.method3595();
          class230_77 = class26.method434(i_26);
          class269 class269_76;
          if (!class230_77.field2604) {
            if (i_25 == -1) {
              class230_77.field2665 = 0;
              class87_1.field1220 = null;
              return true;
            }

            class269_76 = class111.method2563(i_25);
            class230_77.field2665 = 4;
            class230_77.field2593 = i_25;
            class230_77.field2656 = class269_76.field3439;
            class230_77.field2657 = class269_76.field3440;
            class230_77.field2704 = class269_76.field3438 * 100 / i_6;
            class60.method1114(class230_77);
          } else {
            class230_77.field2649 = i_25;
            class230_77.field2727 = i_6;
            class269_76 = class111.method2563(i_25);
            class230_77.field2656 = class269_76.field3439;
            class230_77.field2657 = class269_76.field3440;
            class230_77.field2658 = class269_76.field3474;
            class230_77.field2592 = class269_76.field3442;
            class230_77.field2655 = class269_76.field3443;
            class230_77.field2704 = class269_76.field3438;
            if (class269_76.field3444 == 1) {
              class230_77.field2664 = 1;
            } else {
              class230_77.field2664 = 2;
            }

            if (class230_77.field2660 > 0) {
              class230_77.field2704 = class230_77.field2704 * 32 / class230_77.field2660;
            } else if (class230_77.field2616 > 0) {
              class230_77.field2704 = class230_77.field2704 * 32 / class230_77.field2616;
            }

            class60.method1114(class230_77);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2058 == class87_1.field1220) {
          class143.field1899 = PacketBuffer.method3847(class189_3.getUInt8());
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2104 == class87_1.field1220) {
          i_25 = class189_3.getUInt8();
          class132.method3096(i_25);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2083 == class87_1.field1220) {
          class245.method4619(true, class189_3);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2073 == class87_1.field1220) {
          field822 = true;
          class24.field203 = class189_3.getUInt8();
          class150.field1928 = class189_3.getUInt8();
          class224.field2555 = class189_3.getUInt16();
          class245.field3154 = class189_3.getUInt8();
          class84.field1197 = class189_3.getUInt8();
          if (class84.field1197 >= 100) {
            BufferedFile.field1431 = class24.field203 * 128 + 64;
            class226.field2563 = class150.field1928 * 128 + 64;
            class123.field1702 =
                class27.method460(BufferedFile.field1431, class226.field2563, class13.field82)
                    - class224.field2555;
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2074 == class87_1.field1220) {
          i_25 = class189_3.getInt32();
          if (i_25 != field853) {
            field853 = i_25;
            if (field655 == 1) {
              field663 = true;
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2109 == class87_1.field1220) {
          field599 = class189_3.getUInt8();
          if (field599 == 1) {
            field600 = class189_3.getUInt16();
          }

          if (field599 >= 2 && field599 <= 6) {
            if (field599 == 2) {
              field605 = 64;
              field637 = 64;
            }

            if (field599 == 3) {
              field605 = 0;
              field637 = 64;
            }

            if (field599 == 4) {
              field605 = 128;
              field637 = 64;
            }

            if (field599 == 5) {
              field605 = 64;
              field637 = 0;
            }

            if (field599 == 6) {
              field605 = 64;
              field637 = 128;
            }

            field599 = 2;
            field602 = class189_3.getUInt16();
            field818 = class189_3.getUInt16();
            field604 = class189_3.getUInt8();
          }

          if (field599 == 10) {
            field579 = class189_3.getUInt16();
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2055 == class87_1.field1220) {
          class17.method172(class189_3, class87_1.field1225);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2086 == class87_1.field1220) {
          i_25 = class189_3.getInt32();
          string_5 = class189_3.method3738();
          class230_30 = class26.method434(i_25);
          if (!string_5.equals(class230_30.field2667)) {
            class230_30.field2667 = string_5;
            class60.method1114(class230_30);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2099 == class87_1.field1220) {
          i_25 = class189_3.method3595();
          i_26 = class189_3.method3585();
          class225.field2559[i_26] = i_25;
          if (class225.field2558[i_26] != i_25) {
            class225.field2558[i_26] = i_25;
          }

          class45.method749(i_26);
          field764[++field765 - 1 & 0x1f] = i_26;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2107 == class87_1.field1220) {
          i_25 = class189_3.getUInt16();
          field683 = i_25;
          this.method1151(false);
          class216.method4178(i_25);
          class135.method3114(field683);

          for (i_26 = 0; i_26 < 100; i_26++) {
            field697[i_26] = true;
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2060 == class87_1.field1220) {
          i_25 = class189_3.getInt32();
          class55 class55_53 = (class55) field741.get((long) i_25);
          if (class55_53 != null) {
            class20.method261(class55_53, true);
          }

          if (field744 != null) {
            class60.method1114(field744);
            field744 = null;
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2106 == class87_1.field1220) {
          if (class14.field94 != null) {
            class14.field94.method5489(class189_3);
          }

          class1.method13();
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2129 == class87_1.field1220) {
          i_25 = class189_3.method3588();
          i_26 = class189_3.method3609();
          class230_30 = class26.method434(i_26);
          if (i_25 != class230_30.field2595 || i_25 == -1) {
            class230_30.field2595 = i_25;
            class230_30.field2728 = 0;
            class230_30.field2613 = 0;
            class60.method1114(class230_30);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2072 == class87_1.field1220) {
          for (i_25 = 0; i_25 < field610.length; i_25++) {
            if (field610[i_25] != null) {
              field610[i_25].field903 = -1;
            }
          }

          for (i_25 = 0; i_25 < field843.length; i_25++) {
            if (field843[i_25] != null) {
              field843[i_25].field903 = -1;
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2123 == class87_1.field1220) {
          class181.field2332.method1625();
          field647 = field801;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2059 == class87_1.field1220) {
          class295.method5501();
          i_25 = class189_3.method3770();
          i_26 = class189_3.method3577();
          i_6 = class189_3.method3607();
          field640[i_26] = i_25;
          field712[i_26] = i_6;
          field713[i_26] = 1;

          for (i_27 = 0; i_27 < 98; i_27++) {
            if (i_25 >= class234.field2779[i_27]) {
              field713[i_26] = i_27 + 2;
            }
          }

          field690[++field769 - 1 & 0x1f] = i_26;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2089 == class87_1.field1220) {
          i_25 = class189_3.getInt32();
          i_26 = class189_3.getInt32();
          i_6 = class37.method661();
          OutboundPacket class172_80 = OutboundPacket
              .createOutboundPacket(OutboundPacketDescriptor.field2176, field626.field1218);
          class172_80.buffer.method3574(class47.field393);
          class172_80.buffer.method3673(i_25);
          class172_80.buffer.method3673(i_26);
          class172_80.buffer.method3574(i_6);
          field626.method1980(class172_80);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2102 == class87_1.field1220) {
          class295.method5501();
          field782 = class189_3.method3551();
          field775 = field801;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2076 == class87_1.field1220) {
          if (field683 != -1) {
            i_25 = field683;
            if (class261.method4931(i_25)) {
              class83.method1923(class42.field366[i_25], 0);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2120 == class87_1.field1220) {
          class181.field2332.method1679(class189_3, class87_1.field1225);
          field647 = field801;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2119 == class87_1.field1220) {
          class29.method479(class171.field2247);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2125 == class87_1.field1220) {
          class29.method479(class171.field2243);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2113 == class87_1.field1220) {
          if (class87_1.field1225 == 0) {
            class14.field94 = null;
          } else {
            if (class14.field94 == null) {
              class14.field94 = new class293(class36.field306, Buffer.field2334);
            }

            class14.field94.method5463(class189_3);
          }

          class1.method13();
          class87_1.field1220 = null;
          return true;
        }

        String string_9;
        int i_34;
        if (class168.field2115 == class87_1.field1220) {
          string_49 = class189_3.method3738();
          Temp.field2013 = string_49;

          try {
            string_5 = Buffer.field2334.getParameter(class279.field3596.field3591);
            str_65 = Buffer.field2334.getParameter(class279.field3581.field3591);
            String string_78 =
                string_5 + "settings=" + string_49 + "; version=1; path=/; domain=" + str_65;
            if (string_49.length() == 0) {
              string_78 = string_78 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
              string_74 = string_78 + "; Expires=";
              long_10 = Time.currentTimeMillis() + 94608000000L;
              class192.field2389.setTime(new Date(long_10));
              int i_12 = class192.field2389.get(7);
              i_13 = class192.field2389.get(5);
              i_34 = class192.field2389.get(2);
              i_15 = class192.field2389.get(1);
              int i_24 = class192.field2389.get(11);
              i_35 = class192.field2389.get(12);
              i_18 = class192.field2389.get(13);
              string_9 = class192.field2390[i_12 - 1] + ", " + i_13 / 10 + i_13 % 10 + "-"
                  + class192.field2392[0][i_34] + "-" + i_15 + " " + i_24 / 10 + i_24 % 10 + ":"
                  + i_35 / 10 + i_35 % 10 + ":" + i_18 / 10 + i_18 % 10 + " GMT";
              string_78 = string_74 + string_9 + "; Max-Age=" + 94608000L;
            }

            client client_75 = Buffer.field2334;
            string_9 = "document.cookie=\"" + string_78 + "\"";
            JSObject.getWindow(client_75).eval(string_9);
          } catch (Throwable ignored) {
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2080 == class87_1.field1220) {
          i_25 = class189_3.getUInt8();
          if (class189_3.getUInt8() == 0) {
            field844[i_25] = new class4();
            class189_3.offset += 18;
          } else {
            --class189_3.offset;
            field844[i_25] = new class4(class189_3, false);
          }

          field793 = field801;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2050 == class87_1.field1220) {
          class29.method479(class171.field2245);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2095 == class87_1.field1220) {
          class295.method5501();
          field745 = class189_3.getUInt8();
          field775 = field801;
          class87_1.field1220 = null;
          return true;
        }

        class230 class230_52;
        if (class168.field2088 == class87_1.field1220) {
          i_25 = class189_3.method3595();
          class230_52 = class26.method434(i_25);

          for (i_6 = 0; i_6 < class230_52.field2724.length; i_6++) {
            class230_52.field2724[i_6] = -1;
            class230_52.field2724[i_6] = 0;
          }

          class60.method1114(class230_52);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2068 == class87_1.field1220) {
          class226.field2568 = class189_3.method3577();
          class57.field524 = class189_3.method3765();
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2078 == class87_1.field1220) {
          i_25 = class189_3.method3613();
          if (i_25 == 65535) {
            i_25 = -1;
          }

          if (i_25 == -1 && !field813) {
            class9.method88();
          } else if (i_25 != -1 && i_25 != field812 && field811 != 0 && !field813) {
            class65.method1602(2, class80.field1147, i_25, 0, field811, false);
          }

          field812 = i_25;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2051 == class87_1.field1220) {
          i_25 = class189_3.method3591();
          i_26 = class189_3.method3585();
          if (i_26 == 65535) {
            i_26 = -1;
          }

          class50.method965(i_26, i_25);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2082 == class87_1.field1220) {
          field822 = false;

          for (i_25 = 0; i_25 < 5; i_25++) {
            field823[i_25] = false;
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2053 == class87_1.field1220) {
          i_25 = class189_3.method3770();
          i_26 = class189_3.method3646();
          i_6 = i_26 >> 10 & 0x1f;
          i_27 = i_26 >> 5 & 0x1f;
          i_8 = i_26 & 0x1f;
          i_31 = (i_27 << 11) + (i_6 << 19) + (i_8 << 3);
          class230 class230_79 = class26.method434(i_25);
          if (i_31 != class230_79.field2630) {
            class230_79.field2630 = i_31;
            class60.method1114(class230_79);
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2124 == class87_1.field1220) {
          i_25 = class189_3.method3609();
          class230_52 = class26.method434(i_25);
          class230_52.field2665 = 3;
          class230_52.field2593 = class138.field1876.field546.method4483();
          class60.method1114(class230_52);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2127 == class87_1.field1220) {
          class245.method4619(false, class189_3);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2065 == class87_1.field1220) {
          class29.method479(class171.field2246);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2081 == class87_1.field1220) {
          class29.method479(class171.field2241);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2093 == class87_1.field1220) {
          field795 = class189_3.method3607();
          field630 = class189_3.method3607();
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2132 == class87_1.field1220) {
          bool_64 = class189_3.getUInt8() == 1;
          if (bool_64) {
            class70.field1013 = Time.currentTimeMillis() - class189_3.getUInt64();
            class19.field154 = new class1(class189_3, true);
          } else {
            class19.field154 = null;
          }

          field774 = field801;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2098 == class87_1.field1220) {
          byte b_63 = class189_3.method3610();
          i_26 = class189_3.method3585();
          class225.field2559[i_26] = b_63;
          if (class225.field2558[i_26] != b_63) {
            class225.field2558[i_26] = b_63;
          }

          class45.method749(i_26);
          field764[++field765 - 1 & 0x1f] = i_26;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2077 == class87_1.field1220) {
          i_25 = class189_3.method3613();
          class177.method3507(i_25);
          field766[++field767 - 1 & 0x1f] = i_25 & 0x7fff;
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2087 == class87_1.field1220) {
          i_25 = class189_3.getUInt16();
          i_26 = class189_3.method3595();
          i_6 = class189_3.method3585();
          class230_77 = class26.method434(i_26);
          class230_77.field2732 = i_6 + (i_25 << 16);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2062 == class87_1.field1220) {
          class181.field2332.field975.method5317(class189_3, class87_1.field1225);
          class47.method910();
          if (class14.field94 != null) {
            class14.field94.method5468();
          }

          field647 = field801;
          class87_1.field1220 = null;
          return true;
        }

        class55 class55_39;
        if (class168.field2063 == class87_1.field1220) {
          i_25 = class189_3.method3609();
          i_26 = class189_3.method3770();
          class55 class55_66 = (class55) field741.get((long) i_25);
          class55_39 = (class55) field741.get((long) i_26);
          if (class55_39 != null) {
            class20.method261(class55_39,
                              class55_66 == null || class55_66.field501 != class55_39.field501);
          }

          if (class55_66 != null) {
            class55_66.unlinkNode();
            field741.put(class55_66, (long) i_26);
          }

          class230_73 = class26.method434(i_25);
          if (class230_73 != null) {
            class60.method1114(class230_73);
          }

          class230_73 = class26.method434(i_26);
          if (class230_73 != null) {
            class60.method1114(class230_73);
            Temp
                .method3388(class42.field366[class230_73.field2691 >>> 16], class230_73, true);
          }

          if (field683 != -1) {
            i_31 = field683;
            if (class261.method4931(i_31)) {
              class83.method1923(class42.field366[i_31], 1);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2096 == class87_1.field1220) {
          class65 class65_50 = new class65();
          class65_50.field950 = class189_3.method3738();
          class65_50.field947 = class189_3.getUInt16();
          i_26 = class189_3.getInt32();
          class65_50.field948 = i_26;
          Mouse.method947(45);
          class157_2.close();
          class157_2 = null;
          class61.method1129(class65_50);
          class87_1.field1220 = null;
          return false;
        }

        if (class168.field2057 == class87_1.field1220) {
          i_25 = class189_3.method3765();
          i_26 = class189_3.method3595();
          i_6 = class189_3.method3613();
          class55_39 = (class55) field741.get((long) i_26);
          if (class55_39 != null) {
            class20.method261(class55_39, i_6 != class55_39.field501);
          }

          class55 class55_72 = new class55();
          class55_72.field501 = i_6;
          class55_72.field494 = i_25;
          field741.put(class55_72, (long) i_26);
          class216.method4178(i_6);
          class230 class230_57 = class26.method434(i_26);
          class60.method1114(class230_57);
          if (field744 != null) {
            class60.method1114(field744);
            field744 = null;
          }

          class170.method3448();
          Temp.method3388(class42.field366[i_26 >> 16], class230_57, false);
          class135.method3114(i_6);
          if (field683 != -1) {
            i_38 = field683;
            if (class261.method4931(i_38)) {
              class83.method1923(class42.field366[i_38], 1);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2128 == class87_1.field1220) {
          i_25 = class189_3.method3770();
          i_26 = class189_3.method3613();
          class230_30 = class26.method434(i_25);
          if (class230_30 != null && class230_30.field2721 == 0) {
            if (i_26 > class230_30.field2629 - class230_30.field2621) {
              i_26 = class230_30.field2629 - class230_30.field2621;
            }

            if (i_26 < 0) {
              i_26 = 0;
            }

            if (i_26 != class230_30.field2663) {
              class230_30.field2663 = i_26;
              class60.method1114(class230_30);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2091 == class87_1.field1220) {
          string_49 = class189_3.method3738();

          try {
            i_27 = class189_3.method3562();
            if (i_27 > 32767) {
              i_27 = 32767;
            }

            byte[] bytes_37 = new byte[i_27];
            class189_3.offset += class300.field3712
                .method3480(class189_3.bytes, class189_3.offset, bytes_37, 0, i_27);
            string_9 = class78.method1831(bytes_37, 0, i_27);
            str_65 = string_9;
          } catch (Exception exception_43) {
            str_65 = "Cabbage";
          }

          str_65 = class299.method5521(class51.method998(str_65));
          class143.method3172(6, string_49, str_65);
          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2079 == class87_1.field1220) {
          i_25 = class189_3.offset + class87_1.field1225;
          i_26 = class189_3.getUInt16();
          i_6 = class189_3.getUInt16();
          if (i_26 != field683) {
            field683 = i_26;
            this.method1151(false);
            class216.method4178(field683);
            class135.method3114(field683);

            for (i_27 = 0; i_27 < 100; i_27++) {
              field697[i_27] = true;
            }
          }

          class55 class55_40;
          for (; i_6-- > 0; class55_40.field496 = true) {
            i_27 = class189_3.getInt32();
            i_8 = class189_3.getUInt16();
            i_31 = class189_3.getUInt8();
            class55_40 = (class55) field741.get((long) i_27);
            if (class55_40 != null && i_8 != class55_40.field501) {
              class20.method261(class55_40, true);
              class55_40 = null;
            }

            if (class55_40 == null) {
              class55 class55_41 = new class55();
              class55_41.field501 = i_8;
              class55_41.field494 = i_31;
              field741.put(class55_41, (long) i_27);
              class216.method4178(i_8);
              class230 class230_23 = class26.method434(i_27);
              class60.method1114(class230_23);
              if (field744 != null) {
                class60.method1114(field744);
                field744 = null;
              }

              class170.method3448();
              Temp.method3388(class42.field366[i_27 >> 16], class230_23, false);
              class135.method3114(i_8);
              if (field683 != -1) {
                i_34 = field683;
                if (class261.method4931(i_34)) {
                  class83.method1923(class42.field366[i_34], 1);
                }
              }

              class55_40 = class55_41;
            }
          }

          for (class55_39 = (class55) field741.method4018(); class55_39 != null;
              class55_39 = (class55) field741.method4019()) {
            if (class55_39.field496) {
              class55_39.field496 = false;
            } else {
              class20.method261(class55_39, true);
            }
          }

          field783 = new HashMap(512);

          while (class189_3.offset < i_25) {
            i_27 = class189_3.getInt32();
            i_8 = class189_3.getUInt16();
            i_31 = class189_3.getUInt16();
            i_38 = class189_3.getInt32();

            for (int i_42 = i_8; i_42 <= i_31; i_42++) {
              long_32 = ((long) i_27 << 32) + (long) i_42;
              field783.put(new class211(i_38), long_32);
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2064 == class87_1.field1220) {
          for (i_25 = 0; i_25 < class225.field2558.length; i_25++) {
            if (class225.field2558[i_25] != class225.field2559[i_25]) {
              class225.field2558[i_25] = class225.field2559[i_25];
              class45.method749(i_25);
              field764[++field765 - 1 & 0x1f] = i_25;
            }
          }

          class87_1.field1220 = null;
          return true;
        }

        if (class168.field2130 == class87_1.field1220) {
          i_25 = class189_3.method3770();
          i_26 = class189_3.getUInt16();
          class230_30 = class26.method434(i_25);
          if (class230_30.field2665 != 1 || i_26 != class230_30.field2593) {
            class230_30.field2665 = 1;
            class230_30.field2593 = i_26;
            class60.method1114(class230_30);
          }

          class87_1.field1220 = null;
          return true;
        }

        class5.method65(
            "" + (class87_1.field1220 != null ? class87_1.field1220.field2133 : -1) + "," + (
                class87_1.field1226 != null ? class87_1.field1226.field2133 : -1) + "," + (
                class87_1.field1227 != null ? class87_1.field1227.field2133 : -1) + ","
                + class87_1.field1225, (Throwable) null);
        class97.method2213();
      } catch (IOException ioexception_47) {
        class30.method516();
      } catch (Exception exception_48) {
        string_5 = "" + (class87_1.field1220 != null ? class87_1.field1220.field2133 : -1) + "," + (
            class87_1.field1226 != null ? class87_1.field1226.field2133 : -1) + "," + (
            class87_1.field1227 != null ? class87_1.field1227.field2133 : -1) + ","
            + class87_1.field1225 + "," + (class138.field1876.field922[0] + class62.field868) + ","
            + (class138.field1876.field872[0] + field754) + ",";

        for (i_6 = 0; i_6 < class87_1.field1225 && i_6 < 50; i_6++) {
          string_5 = string_5 + class189_3.bytes[i_6] + ",";
        }

        class5.method65(string_5, exception_48);
        class97.method2213();
      }

      return true;
    }
  }

  @ObfuscatedName("hz")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "652063494"
  )
  final void method1233() {
    class134.method3103();
    if (class276.field3559 == null) {
      if (field583 == null) {
        int i_1 = Mouse.field431;
        int i_2;
        int i_4;
        int i_5;
        int i_6;
        if (field716) {
          int i_3;
          if (i_1 != 1 && (class253.field3229 || i_1 != 4)) {
            i_2 = Mouse.field425;
            i_3 = Mouse.field426 * 673804999;
            if (i_2 < Mouse.field435 - 10 || i_2 > class135.field1856 + Mouse.field435 + 10
                || i_3 < class0.field1 - 10 || i_3 > Temp.field1933 + class0.field1 + 10) {
              field716 = false;
              Mouse.method948(Mouse.field435, class0.field1, class135.field1856,
                              Temp.field1933);
            }
          }

          if (i_1 == 1 || !class253.field3229 && i_1 == 4) {
            i_2 = Mouse.field435;
            i_3 = class0.field1;
            i_4 = class135.field1856;
            i_5 = Mouse.field432;
            i_6 = Mouse.field428;
            int i_7 = -1;

            for (int i_8 = 0; i_8 < field771; i_8++) {
              int i_9 = i_3 + (field771 - 1 - i_8) * 15 + 31;
              if (i_5 > i_2 && i_5 < i_2 + i_4 && i_6 > i_9 - 13 && i_6 < i_9 + 3) {
                i_7 = i_8;
              }
            }

            if (i_7 != -1) {
              class112.method2564(i_7);
            }

            field716 = false;
            Mouse
                .method948(Mouse.field435, class0.field1, class135.field1856, Temp.field1933);
          }
        } else {
          i_2 = field771 - 1;
          if ((i_1 == 1 || !class253.field3229 && i_1 == 4) && i_2 >= 0) {
            i_4 = field720[i_2];
            if (i_4 == 39 || i_4 == 40 || i_4 == 41 || i_4 == 42 || i_4 == 43 || i_4 == 33
                || i_4 == 34 || i_4 == 35 || i_4 == 36 || i_4 == 37 || i_4 == 38 || i_4 == 1005) {
              i_5 = field718[i_2];
              i_6 = field851[i_2];
              class230 class230_10 = class26.method434(i_6);
              if (class7.method83(class24.method425(class230_10)) || class140
                  .method3150(class24.method425(class230_10))) {
                if (class276.field3559 != null && !field689 && field771 > 0 && !this.method1149()) {
                  class60.method1120(field678, field821);
                }

                field689 = false;
                field693 = 0;
                if (class276.field3559 != null) {
                  class60.method1114(class276.field3559);
                }

                class276.field3559 = class26.method434(i_6);
                field688 = i_5;
                field678 = Mouse.field432;
                field821 = Mouse.field428;
                if (i_2 >= 0) {
                  class229.field2588 = new class75();
                  class229.field2588.field1066 = field718[i_2];
                  class229.field2588.field1060 = field851[i_2];
                  class229.field2588.field1061 = field720[i_2];
                  class229.field2588.field1062 = field794[i_2];
                  class229.field2588.field1063 = field735[i_2];
                }

                class60.method1114(class276.field3559);
                return;
              }
            }
          }

          if ((i_1 == 1 || !class253.field3229 && i_1 == 4) && this.method1149()) {
            i_1 = 2;
          }

          if ((i_1 == 1 || !class253.field3229 && i_1 == 4) && field771 > 0) {
            class112.method2564(i_2);
          }

          if (i_1 == 2 && field771 > 0) {
            this.method1476(Mouse.field432, Mouse.field428);
          }
        }

      }
    }
  }

  @ObfuscatedName("hq")
  @ObfuscatedSignature(
      signature = "(B)Z",
      garbageValue = "62"
  )
  final boolean method1149() {
    int i_1 = field771 - 1;
    return (field715 == 1 && field771 > 2 || class43.method713(i_1)) && !field590[i_1];
  }

  @ObfuscatedName("hv")
  @ObfuscatedSignature(
      signature = "(III)V",
      garbageValue = "762160951"
  )
  final void method1476(int i_1, int i_2) {
    method3785(i_1, i_2);
    class28.field248.method2909(class13.field82, i_1, i_2, false);
    field716 = true;
  }

  @ObfuscatedName("ir")
  @ObfuscatedSignature(
      signature = "(ZI)V",
      garbageValue = "-1642962644"
  )
  final void method1151(boolean bool_1) {
    class84.method1946(field683, class82.field1179, class243.field3138, bool_1);
  }

  @ObfuscatedName("iv")
  @ObfuscatedSignature(
      signature = "(Lhi;I)V",
      garbageValue = "-1711634701"
  )
  void method1152(class230 class230_1) {
    class230 class230_2 =
        class230_1.field2605 == -1 ? null : class26.method434(class230_1.field2605);
    int i_3;
    int i_4;
    if (class230_2 == null) {
      i_3 = class82.field1179;
      i_4 = class243.field3138;
    } else {
      i_3 = class230_2.field2675;
      i_4 = class230_2.field2621;
    }

    class64.method1563(class230_1, i_3, i_4, false);
    class22.method281(class230_1, i_3, i_4);
  }

  @ObfuscatedName("jk")
  @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "-114951756"
  )
  final void method1448() {
    class60.method1114(field583);
    ++class6.field39;
    if (field772 && field601) {
      int i_1 = Mouse.field425;
      int i_2 = Mouse.field426 * 673804999;
      i_1 -= field753;
      i_2 -= field749;
      if (i_1 < field757) {
        i_1 = field757;
      }

      if (i_1 + field583.field2675 > field757 + field752.field2675) {
        i_1 = field757 + field752.field2675 - field583.field2675;
      }

      if (i_2 < field758) {
        i_2 = field758;
      }

      if (i_2 + field583.field2621 > field758 + field752.field2621) {
        i_2 = field758 + field752.field2621 - field583.field2621;
      }

      int i_3 = i_1 - field696;
      int i_4 = i_2 - field760;
      int i_5 = field583.field2682;
      if (class6.field39 > field583.field2684 && (i_3 > i_5 || i_3 < -i_5 || i_4 > i_5
          || i_4 < -i_5)) {
        field763 = true;
      }

      int i_6 = i_1 - field757 + field752.field2626;
      int i_7 = i_2 - field758 + field752.field2663;
      class56 class56_8;
      if (field583.field2695 != null && field763) {
        class56_8 = new class56();
        class56_8.field506 = field583;
        class56_8.field511 = i_6;
        class56_8.field508 = i_7;
        class56_8.field512 = field583.field2695;
        class68.method1696(class56_8);
      }

      if (Mouse.field419 == 0) {
        if (field763) {
          if (field583.field2696 != null) {
            class56_8 = new class56();
            class56_8.field506 = field583;
            class56_8.field511 = i_6;
            class56_8.field508 = i_7;
            class56_8.field507 = field755;
            class56_8.field512 = field583.field2696;
            class68.method1696(class56_8);
          }

          if (field755 != null) {
            class230 class230_9 = field583;
            int i_10 = IssacRandom.method3865(class24.method425(class230_9));
            class230 class230_13;
            if (i_10 == 0) {
              class230_13 = null;
            } else {
              int i_11 = 0;

              while (true) {
                if (i_11 >= i_10) {
                  class230_13 = class230_9;
                  break;
                }

                class230_9 = class26.method434(class230_9.field2605);
                if (class230_9 == null) {
                  class230_13 = null;
                  break;
                }

                ++i_11;
              }
            }

            if (class230_13 != null) {
              OutboundPacket class172_12 = OutboundPacket
                  .createOutboundPacket(OutboundPacketDescriptor.field2164, field626.field1218);
              class172_12.buffer.method3583(field583.field2606);
              class172_12.buffer.method3771(field583.field2649);
              class172_12.buffer.method3673(field755.field2691);
              class172_12.buffer.method3582(field755.field2649);
              class172_12.buffer.method3594(field583.field2691);
              class172_12.buffer.method3755(field755.field2606);
              field626.method1980(class172_12);
            }
          }
        } else if (this.method1149()) {
          this.method1476(field696 + field753, field749 + field760);
        } else if (field771 > 0) {
          class60.method1120(field753 + field696, field749 + field760);
        }

        field583 = null;
      }

    } else {
      if (class6.field39 > 1) {
        field583 = null;
      }

    }
  }

  @ObfuscatedName("jh")
  @ObfuscatedSignature(
      signature = "(I)Lkm;",
      garbageValue = "-1900287408"
  )
  public class291 vmethod5420() {
    return class138.field1876 != null ? class138.field1876.field552 : null;
  }

}

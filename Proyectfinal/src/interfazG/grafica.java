package interfazG;

import java.awt.event.ActionEvent;


public class grafica extends javax.swing.JFrame {
    private matrixgrafica matrixgrafica;
    private dificultad dificultad;
    
    public grafica() {
        initComponents();
        matrix();
    }
        
    public void matrix(){
        matrixgrafica = new matrixgrafica();
        matrixgrafica.setTxtancho(40);
        matrixgrafica.setTxtaltura(41);
        matrixgrafica.setEspacio(4);
        fondo0.add(matrixgrafica);
        matrixgrafica.setLocation(47, 50);
        matrixgrafica.setVisible(true);
        matrixgrafica.fisicasudoku();
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo0 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t85 = new javax.swing.JTextField();
        t86 = new javax.swing.JTextField();
        t87 = new javax.swing.JTextField();
        t88 = new javax.swing.JTextField();
        t89 = new javax.swing.JTextField();
        t90 = new javax.swing.JTextField();
        t91 = new javax.swing.JTextField();
        t92 = new javax.swing.JTextField();
        t93 = new javax.swing.JTextField();
        t94 = new javax.swing.JTextField();
        t95 = new javax.swing.JTextField();
        t96 = new javax.swing.JTextField();
        t97 = new javax.swing.JTextField();
        t98 = new javax.swing.JTextField();
        t99 = new javax.swing.JTextField();
        t100 = new javax.swing.JTextField();
        t101 = new javax.swing.JTextField();
        t102 = new javax.swing.JTextField();
        t103 = new javax.swing.JTextField();
        t104 = new javax.swing.JTextField();
        t105 = new javax.swing.JTextField();
        t106 = new javax.swing.JTextField();
        t107 = new javax.swing.JTextField();
        t108 = new javax.swing.JTextField();
        t109 = new javax.swing.JTextField();
        t110 = new javax.swing.JTextField();
        t111 = new javax.swing.JTextField();
        t112 = new javax.swing.JTextField();
        t113 = new javax.swing.JTextField();
        t114 = new javax.swing.JTextField();
        t115 = new javax.swing.JTextField();
        t116 = new javax.swing.JTextField();
        t117 = new javax.swing.JTextField();
        t118 = new javax.swing.JTextField();
        t119 = new javax.swing.JTextField();
        t120 = new javax.swing.JTextField();
        t121 = new javax.swing.JTextField();
        t122 = new javax.swing.JTextField();
        t123 = new javax.swing.JTextField();
        t124 = new javax.swing.JTextField();
        t125 = new javax.swing.JTextField();
        t126 = new javax.swing.JTextField();
        t127 = new javax.swing.JTextField();
        t128 = new javax.swing.JTextField();
        t129 = new javax.swing.JTextField();
        t130 = new javax.swing.JTextField();
        t131 = new javax.swing.JTextField();
        t132 = new javax.swing.JTextField();
        t133 = new javax.swing.JTextField();
        t134 = new javax.swing.JTextField();
        t135 = new javax.swing.JTextField();
        t136 = new javax.swing.JTextField();
        t137 = new javax.swing.JTextField();
        t138 = new javax.swing.JTextField();
        t139 = new javax.swing.JTextField();
        t140 = new javax.swing.JTextField();
        t141 = new javax.swing.JTextField();
        t142 = new javax.swing.JTextField();
        t143 = new javax.swing.JTextField();
        t144 = new javax.swing.JTextField();
        t145 = new javax.swing.JTextField();
        t146 = new javax.swing.JTextField();
        t147 = new javax.swing.JTextField();
        t148 = new javax.swing.JTextField();
        t149 = new javax.swing.JTextField();
        t150 = new javax.swing.JTextField();
        t151 = new javax.swing.JTextField();
        t152 = new javax.swing.JTextField();
        t153 = new javax.swing.JTextField();
        t154 = new javax.swing.JTextField();
        t155 = new javax.swing.JTextField();
        t156 = new javax.swing.JTextField();
        t157 = new javax.swing.JTextField();
        t158 = new javax.swing.JTextField();
        t159 = new javax.swing.JTextField();
        t160 = new javax.swing.JTextField();
        t161 = new javax.swing.JTextField();
        t162 = new javax.swing.JTextField();
        t163 = new javax.swing.JTextField();
        t164 = new javax.swing.JTextField();
        t168 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo0.setBackground(new java.awt.Color(0, 0, 0));
        fondo0.setPreferredSize(new java.awt.Dimension(500, 400));
        fondo0.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUDOKU");
        fondo0.add(jLabel1);
        jLabel1.setBounds(430, 0, 120, 40);

        t85.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t85KeyReleased(evt);
            }
        });
        fondo0.add(t85);
        t85.setBounds(180, 350, 30, 30);

        t86.setBackground(new java.awt.Color(255, 0, 51));
        t86.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t86KeyReleased(evt);
            }
        });
        fondo0.add(t86);
        t86.setBounds(100, 70, 30, 30);

        t87.setBackground(new java.awt.Color(255, 0, 51));
        t87.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t87KeyReleased(evt);
            }
        });
        fondo0.add(t87);
        t87.setBounds(140, 70, 30, 30);

        t88.setBackground(new java.awt.Color(255, 0, 51));
        t88.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t88KeyReleased(evt);
            }
        });
        fondo0.add(t88);
        t88.setBounds(60, 110, 30, 30);

        t89.setBackground(new java.awt.Color(255, 0, 51));
        t89.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t89KeyReleased(evt);
            }
        });
        fondo0.add(t89);
        t89.setBounds(140, 110, 30, 30);

        t90.setBackground(new java.awt.Color(255, 0, 51));
        t90.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t90KeyReleased(evt);
            }
        });
        fondo0.add(t90);
        t90.setBounds(100, 110, 30, 30);

        t91.setBackground(new java.awt.Color(255, 0, 51));
        t91.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t91KeyReleased(evt);
            }
        });
        fondo0.add(t91);
        t91.setBounds(60, 150, 30, 30);

        t92.setBackground(new java.awt.Color(255, 0, 51));
        t92.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t92KeyReleased(evt);
            }
        });
        fondo0.add(t92);
        t92.setBounds(100, 150, 30, 30);

        t93.setBackground(new java.awt.Color(255, 0, 51));
        t93.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t93KeyReleased(evt);
            }
        });
        fondo0.add(t93);
        t93.setBounds(140, 150, 30, 30);

        t94.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t94KeyReleased(evt);
            }
        });
        fondo0.add(t94);
        t94.setBounds(60, 190, 30, 30);

        t95.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t95KeyReleased(evt);
            }
        });
        fondo0.add(t95);
        t95.setBounds(100, 190, 30, 30);

        t96.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t96KeyReleased(evt);
            }
        });
        fondo0.add(t96);
        t96.setBounds(60, 230, 30, 30);

        t97.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t97KeyReleased(evt);
            }
        });
        fondo0.add(t97);
        t97.setBounds(100, 230, 30, 30);

        t98.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t98KeyReleased(evt);
            }
        });
        fondo0.add(t98);
        t98.setBounds(140, 230, 30, 30);

        t99.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t99KeyReleased(evt);
            }
        });
        fondo0.add(t99);
        t99.setBounds(60, 270, 30, 30);

        t100.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t100KeyReleased(evt);
            }
        });
        fondo0.add(t100);
        t100.setBounds(100, 270, 30, 30);

        t101.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t101KeyReleased(evt);
            }
        });
        fondo0.add(t101);
        t101.setBounds(140, 270, 30, 30);

        t102.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t102KeyReleased(evt);
            }
        });
        fondo0.add(t102);
        t102.setBounds(60, 310, 30, 30);

        t103.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t103KeyReleased(evt);
            }
        });
        fondo0.add(t103);
        t103.setBounds(100, 310, 30, 30);

        t104.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t104KeyReleased(evt);
            }
        });
        fondo0.add(t104);
        t104.setBounds(140, 310, 30, 30);

        t105.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t105KeyReleased(evt);
            }
        });
        fondo0.add(t105);
        t105.setBounds(60, 350, 30, 30);

        t106.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t106KeyReleased(evt);
            }
        });
        fondo0.add(t106);
        t106.setBounds(100, 350, 30, 30);

        t107.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t107KeyReleased(evt);
            }
        });
        fondo0.add(t107);
        t107.setBounds(140, 350, 30, 30);

        t108.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t108KeyReleased(evt);
            }
        });
        fondo0.add(t108);
        t108.setBounds(60, 390, 30, 30);

        t109.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t109KeyReleased(evt);
            }
        });
        fondo0.add(t109);
        t109.setBounds(100, 390, 30, 30);

        t110.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t110KeyReleased(evt);
            }
        });
        fondo0.add(t110);
        t110.setBounds(140, 390, 30, 30);

        t111.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t111KeyReleased(evt);
            }
        });
        fondo0.add(t111);
        t111.setBounds(180, 70, 30, 30);

        t112.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t112KeyReleased(evt);
            }
        });
        fondo0.add(t112);
        t112.setBounds(220, 70, 30, 30);

        t113.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t113KeyReleased(evt);
            }
        });
        fondo0.add(t113);
        t113.setBounds(260, 70, 30, 30);

        t114.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t114KeyReleased(evt);
            }
        });
        fondo0.add(t114);
        t114.setBounds(180, 110, 30, 30);

        t115.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t115KeyReleased(evt);
            }
        });
        fondo0.add(t115);
        t115.setBounds(220, 110, 30, 30);

        t116.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t116KeyReleased(evt);
            }
        });
        fondo0.add(t116);
        t116.setBounds(260, 110, 30, 30);

        t117.setBackground(new java.awt.Color(255, 0, 51));
        t117.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t117KeyReleased(evt);
            }
        });
        fondo0.add(t117);
        t117.setBounds(60, 70, 30, 30);

        t118.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t118KeyReleased(evt);
            }
        });
        fondo0.add(t118);
        t118.setBounds(220, 150, 30, 30);

        t119.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t119KeyReleased(evt);
            }
        });
        fondo0.add(t119);
        t119.setBounds(260, 150, 30, 30);

        t120.setBackground(new java.awt.Color(255, 0, 51));
        t120.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t120KeyReleased(evt);
            }
        });
        fondo0.add(t120);
        t120.setBounds(180, 190, 30, 30);

        t121.setBackground(new java.awt.Color(255, 0, 51));
        t121.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t121KeyReleased(evt);
            }
        });
        fondo0.add(t121);
        t121.setBounds(220, 190, 30, 30);

        t122.setBackground(new java.awt.Color(255, 0, 51));
        t122.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t122KeyReleased(evt);
            }
        });
        fondo0.add(t122);
        t122.setBounds(260, 190, 30, 30);

        t123.setBackground(new java.awt.Color(255, 0, 51));
        t123.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t123KeyReleased(evt);
            }
        });
        fondo0.add(t123);
        t123.setBounds(180, 230, 30, 30);

        t124.setBackground(new java.awt.Color(255, 0, 51));
        t124.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t124KeyReleased(evt);
            }
        });
        fondo0.add(t124);
        t124.setBounds(220, 230, 30, 30);

        t125.setBackground(new java.awt.Color(255, 0, 51));
        t125.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t125KeyReleased(evt);
            }
        });
        fondo0.add(t125);
        t125.setBounds(260, 230, 30, 30);

        t126.setBackground(new java.awt.Color(255, 0, 51));
        t126.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t126KeyReleased(evt);
            }
        });
        fondo0.add(t126);
        t126.setBounds(180, 270, 30, 30);

        t127.setBackground(new java.awt.Color(255, 0, 51));
        t127.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t127KeyReleased(evt);
            }
        });
        fondo0.add(t127);
        t127.setBounds(220, 270, 30, 30);

        t128.setBackground(new java.awt.Color(255, 0, 51));
        t128.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t128KeyReleased(evt);
            }
        });
        fondo0.add(t128);
        t128.setBounds(260, 270, 30, 30);

        t129.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t129KeyReleased(evt);
            }
        });
        fondo0.add(t129);
        t129.setBounds(180, 310, 30, 30);

        t130.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t130KeyReleased(evt);
            }
        });
        fondo0.add(t130);
        t130.setBounds(220, 310, 30, 30);

        t131.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t131KeyReleased(evt);
            }
        });
        fondo0.add(t131);
        t131.setBounds(260, 310, 30, 30);

        t132.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t132KeyReleased(evt);
            }
        });
        fondo0.add(t132);
        t132.setBounds(140, 190, 30, 30);

        t133.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t133KeyReleased(evt);
            }
        });
        fondo0.add(t133);
        t133.setBounds(220, 350, 30, 30);

        t134.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t134KeyReleased(evt);
            }
        });
        fondo0.add(t134);
        t134.setBounds(260, 350, 30, 30);

        t135.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t135KeyReleased(evt);
            }
        });
        fondo0.add(t135);
        t135.setBounds(180, 390, 30, 30);

        t136.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t136KeyReleased(evt);
            }
        });
        fondo0.add(t136);
        t136.setBounds(220, 390, 30, 30);

        t137.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t137KeyReleased(evt);
            }
        });
        fondo0.add(t137);
        t137.setBounds(260, 390, 30, 30);

        t138.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t138KeyReleased(evt);
            }
        });
        fondo0.add(t138);
        t138.setBounds(300, 70, 30, 30);

        t139.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t139KeyReleased(evt);
            }
        });
        fondo0.add(t139);
        t139.setBounds(340, 70, 30, 30);

        t140.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t140KeyReleased(evt);
            }
        });
        fondo0.add(t140);
        t140.setBounds(380, 70, 30, 30);

        t141.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t141KeyReleased(evt);
            }
        });
        fondo0.add(t141);
        t141.setBounds(300, 110, 30, 30);

        t142.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t142KeyReleased(evt);
            }
        });
        fondo0.add(t142);
        t142.setBounds(340, 110, 30, 30);

        t143.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t143KeyReleased(evt);
            }
        });
        fondo0.add(t143);
        t143.setBounds(380, 110, 30, 30);

        t144.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t144KeyReleased(evt);
            }
        });
        fondo0.add(t144);
        t144.setBounds(300, 150, 30, 30);

        t145.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t145KeyReleased(evt);
            }
        });
        fondo0.add(t145);
        t145.setBounds(340, 150, 30, 30);

        t146.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t146KeyReleased(evt);
            }
        });
        fondo0.add(t146);
        t146.setBounds(380, 150, 30, 30);

        t147.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t147KeyReleased(evt);
            }
        });
        fondo0.add(t147);
        t147.setBounds(300, 190, 30, 30);

        t148.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t148KeyReleased(evt);
            }
        });
        fondo0.add(t148);
        t148.setBounds(340, 190, 30, 30);

        t149.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t149KeyReleased(evt);
            }
        });
        fondo0.add(t149);
        t149.setBounds(380, 190, 30, 30);

        t150.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t150KeyReleased(evt);
            }
        });
        fondo0.add(t150);
        t150.setBounds(300, 230, 30, 30);

        t151.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t151KeyReleased(evt);
            }
        });
        fondo0.add(t151);
        t151.setBounds(340, 230, 30, 30);

        t152.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t152KeyReleased(evt);
            }
        });
        fondo0.add(t152);
        t152.setBounds(380, 230, 30, 30);

        t153.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t153KeyReleased(evt);
            }
        });
        fondo0.add(t153);
        t153.setBounds(300, 270, 30, 30);

        t154.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t154KeyReleased(evt);
            }
        });
        fondo0.add(t154);
        t154.setBounds(340, 270, 30, 30);

        t155.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t155KeyReleased(evt);
            }
        });
        fondo0.add(t155);
        t155.setBounds(380, 270, 30, 30);

        t156.setBackground(new java.awt.Color(255, 0, 51));
        t156.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t156KeyReleased(evt);
            }
        });
        fondo0.add(t156);
        t156.setBounds(300, 310, 30, 30);

        t157.setBackground(new java.awt.Color(255, 0, 51));
        t157.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t157KeyReleased(evt);
            }
        });
        fondo0.add(t157);
        t157.setBounds(340, 310, 30, 30);

        t158.setBackground(new java.awt.Color(255, 0, 51));
        t158.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t158KeyReleased(evt);
            }
        });
        fondo0.add(t158);
        t158.setBounds(380, 310, 30, 30);

        t159.setBackground(new java.awt.Color(255, 0, 51));
        t159.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t159KeyReleased(evt);
            }
        });
        fondo0.add(t159);
        t159.setBounds(300, 350, 30, 30);

        t160.setBackground(new java.awt.Color(255, 0, 51));
        t160.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t160KeyReleased(evt);
            }
        });
        fondo0.add(t160);
        t160.setBounds(340, 350, 30, 30);

        t161.setBackground(new java.awt.Color(255, 0, 51));
        t161.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t161KeyReleased(evt);
            }
        });
        fondo0.add(t161);
        t161.setBounds(380, 350, 30, 30);

        t162.setBackground(new java.awt.Color(255, 0, 51));
        t162.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t162KeyReleased(evt);
            }
        });
        fondo0.add(t162);
        t162.setBounds(300, 390, 30, 30);

        t163.setBackground(new java.awt.Color(255, 0, 51));
        t163.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t163KeyReleased(evt);
            }
        });
        fondo0.add(t163);
        t163.setBounds(340, 390, 30, 30);

        t164.setBackground(new java.awt.Color(255, 0, 51));
        t164.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t164KeyReleased(evt);
            }
        });
        fondo0.add(t164);
        t164.setBounds(380, 390, 30, 30);

        t168.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t168KeyReleased(evt);
            }
        });
        fondo0.add(t168);
        t168.setBounds(180, 150, 30, 30);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Crear Partida");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondo0.add(jButton1);
        jButton1.setBounds(420, 440, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo0, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo0, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t85KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t85KeyReleased
        
    }//GEN-LAST:event_t85KeyReleased

    private void t86KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t86KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t86KeyReleased

    private void t87KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t87KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t87KeyReleased

    private void t88KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t88KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t88KeyReleased

    private void t89KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t89KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t89KeyReleased

    private void t90KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t90KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t90KeyReleased

    private void t91KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t91KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t91KeyReleased

    private void t92KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t92KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t92KeyReleased

    private void t93KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t93KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t93KeyReleased

    private void t94KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t94KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t94KeyReleased

    private void t95KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t95KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t95KeyReleased

    private void t96KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t96KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t96KeyReleased

    private void t97KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t97KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t97KeyReleased

    private void t98KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t98KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t98KeyReleased

    private void t99KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t99KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t99KeyReleased

    private void t100KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t100KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t100KeyReleased

    private void t101KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t101KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t101KeyReleased

    private void t102KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t102KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t102KeyReleased

    private void t103KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t103KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t103KeyReleased

    private void t104KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t104KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t104KeyReleased

    private void t105KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t105KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t105KeyReleased

    private void t106KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t106KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t106KeyReleased

    private void t107KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t107KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t107KeyReleased

    private void t108KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t108KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t108KeyReleased

    private void t109KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t109KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t109KeyReleased

    private void t110KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t110KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t110KeyReleased

    private void t111KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t111KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t111KeyReleased

    private void t112KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t112KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t112KeyReleased

    private void t113KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t113KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t113KeyReleased

    private void t114KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t114KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t114KeyReleased

    private void t115KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t115KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t115KeyReleased

    private void t116KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t116KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t116KeyReleased

    private void t117KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t117KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t117KeyReleased

    private void t118KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t118KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t118KeyReleased

    private void t119KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t119KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t119KeyReleased

    private void t120KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t120KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t120KeyReleased

    private void t121KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t121KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t121KeyReleased

    private void t122KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t122KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t122KeyReleased

    private void t123KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t123KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t123KeyReleased

    private void t124KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t124KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t124KeyReleased

    private void t125KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t125KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t125KeyReleased

    private void t126KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t126KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t126KeyReleased

    private void t127KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t127KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t127KeyReleased

    private void t128KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t128KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t128KeyReleased

    private void t129KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t129KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t129KeyReleased

    private void t130KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t130KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t130KeyReleased

    private void t131KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t131KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t131KeyReleased

    private void t132KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t132KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t132KeyReleased

    private void t133KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t133KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t133KeyReleased

    private void t134KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t134KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t134KeyReleased

    private void t135KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t135KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t135KeyReleased

    private void t136KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t136KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t136KeyReleased

    private void t137KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t137KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t137KeyReleased

    private void t138KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t138KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t138KeyReleased

    private void t139KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t139KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t139KeyReleased

    private void t140KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t140KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t140KeyReleased

    private void t141KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t141KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t141KeyReleased

    private void t142KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t142KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t142KeyReleased

    private void t143KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t143KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t143KeyReleased

    private void t144KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t144KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t144KeyReleased

    private void t145KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t145KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t145KeyReleased

    private void t146KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t146KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t146KeyReleased

    private void t147KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t147KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t147KeyReleased

    private void t148KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t148KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t148KeyReleased

    private void t149KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t149KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t149KeyReleased

    private void t150KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t150KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t150KeyReleased

    private void t151KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t151KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t151KeyReleased

    private void t152KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t152KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t152KeyReleased

    private void t153KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t153KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t153KeyReleased

    private void t154KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t154KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t154KeyReleased

    private void t155KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t155KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t155KeyReleased

    private void t156KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t156KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t156KeyReleased

    private void t157KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t157KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t157KeyReleased

    private void t158KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t158KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t158KeyReleased

    private void t159KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t159KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t159KeyReleased

    private void t160KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t160KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t160KeyReleased

    private void t161KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t161KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t161KeyReleased

    private void t162KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t162KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t162KeyReleased

    private void t163KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t163KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t163KeyReleased

    private void t164KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t164KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t164KeyReleased

    private void t168KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t168KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_t168KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        if(dificultad!=null){
            dificultad.setVisible(true);
        }else{
        dificultad=new dificultad();
        dificultad.setVisible(true); 
        }
    }//GEN-LAST:event_jButton1MousePressed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo0;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField t100;
    private javax.swing.JTextField t101;
    private javax.swing.JTextField t102;
    private javax.swing.JTextField t103;
    private javax.swing.JTextField t104;
    private javax.swing.JTextField t105;
    private javax.swing.JTextField t106;
    private javax.swing.JTextField t107;
    private javax.swing.JTextField t108;
    private javax.swing.JTextField t109;
    private javax.swing.JTextField t110;
    private javax.swing.JTextField t111;
    private javax.swing.JTextField t112;
    private javax.swing.JTextField t113;
    private javax.swing.JTextField t114;
    private javax.swing.JTextField t115;
    private javax.swing.JTextField t116;
    private javax.swing.JTextField t117;
    private javax.swing.JTextField t118;
    private javax.swing.JTextField t119;
    private javax.swing.JTextField t120;
    private javax.swing.JTextField t121;
    private javax.swing.JTextField t122;
    private javax.swing.JTextField t123;
    private javax.swing.JTextField t124;
    private javax.swing.JTextField t125;
    private javax.swing.JTextField t126;
    private javax.swing.JTextField t127;
    private javax.swing.JTextField t128;
    private javax.swing.JTextField t129;
    private javax.swing.JTextField t130;
    private javax.swing.JTextField t131;
    private javax.swing.JTextField t132;
    private javax.swing.JTextField t133;
    private javax.swing.JTextField t134;
    private javax.swing.JTextField t135;
    private javax.swing.JTextField t136;
    private javax.swing.JTextField t137;
    private javax.swing.JTextField t138;
    private javax.swing.JTextField t139;
    private javax.swing.JTextField t140;
    private javax.swing.JTextField t141;
    private javax.swing.JTextField t142;
    private javax.swing.JTextField t143;
    private javax.swing.JTextField t144;
    private javax.swing.JTextField t145;
    private javax.swing.JTextField t146;
    private javax.swing.JTextField t147;
    private javax.swing.JTextField t148;
    private javax.swing.JTextField t149;
    private javax.swing.JTextField t150;
    private javax.swing.JTextField t151;
    private javax.swing.JTextField t152;
    private javax.swing.JTextField t153;
    private javax.swing.JTextField t154;
    private javax.swing.JTextField t155;
    private javax.swing.JTextField t156;
    private javax.swing.JTextField t157;
    private javax.swing.JTextField t158;
    private javax.swing.JTextField t159;
    private javax.swing.JTextField t160;
    private javax.swing.JTextField t161;
    private javax.swing.JTextField t162;
    private javax.swing.JTextField t163;
    private javax.swing.JTextField t164;
    private javax.swing.JTextField t168;
    private javax.swing.JTextField t85;
    private javax.swing.JTextField t86;
    private javax.swing.JTextField t87;
    private javax.swing.JTextField t88;
    private javax.swing.JTextField t89;
    private javax.swing.JTextField t90;
    private javax.swing.JTextField t91;
    private javax.swing.JTextField t92;
    private javax.swing.JTextField t93;
    private javax.swing.JTextField t94;
    private javax.swing.JTextField t95;
    private javax.swing.JTextField t96;
    private javax.swing.JTextField t97;
    private javax.swing.JTextField t98;
    private javax.swing.JTextField t99;
    // End of variables declaration//GEN-END:variables
}

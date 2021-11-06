package calculatorapplication;

public class CalculatorJFrame extends javax.swing.JFrame {
    // Fields
    private char currentOperand;
    private double num1;
    private double num2;
    
    public CalculatorJFrame() 
    {
        initComponents();
    }
    
    private void addToOutputField(String str)
    {
        String text = OutputTextField.getText();
        
        if (str.equals("0") && text.equals("0")) // Solving problem 00000000.013 to 0.013
            return;
        
        OutputTextField.setText(text.concat(str));
    }
    
    private void setOperand(char operand)
    {
        String text = OutputTextField.getText();
        if (text.length() == 0) return;
        
        currentOperand = operand;
        
        try
        {
            num1 = Double.parseDouble(text);
        }
        catch (Exception e)
        {
            // OutputTextField.setText(e.getMessage());
        }
        finally
        {
            OutputTextField.setText("");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EitghtButton = new javax.swing.JButton();
        NineButton = new javax.swing.JButton();
        FourButton = new javax.swing.JButton();
        FiveButton = new javax.swing.JButton();
        SixButton = new javax.swing.JButton();
        OneButton = new javax.swing.JButton();
        TwoButton = new javax.swing.JButton();
        ThreeButton = new javax.swing.JButton();
        ZeroButton = new javax.swing.JButton();
        EqualsButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        MultiplyButton = new javax.swing.JButton();
        DivideButton = new javax.swing.JButton();
        SubtractButton = new javax.swing.JButton();
        OutputTextField = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        PointButton = new javax.swing.JButton();
        EitghtButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(30, 28, 31));
        setResizable(false);

        EitghtButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EitghtButton.setForeground(new java.awt.Color(64, 64, 64));
        EitghtButton.setText("8");
        EitghtButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EitghtButton.setMaximumSize(new java.awt.Dimension(39, 39));
        EitghtButton.setMinimumSize(new java.awt.Dimension(39, 39));
        EitghtButton.setPreferredSize(new java.awt.Dimension(39, 39));
        EitghtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EitghtButtonActionPerformed(evt);
            }
        });

        NineButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NineButton.setForeground(new java.awt.Color(64, 64, 64));
        NineButton.setText("9");
        NineButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NineButton.setMaximumSize(new java.awt.Dimension(39, 39));
        NineButton.setMinimumSize(new java.awt.Dimension(39, 39));
        NineButton.setPreferredSize(new java.awt.Dimension(39, 39));
        NineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NineButtonActionPerformed(evt);
            }
        });

        FourButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FourButton.setForeground(new java.awt.Color(64, 64, 64));
        FourButton.setText("4");
        FourButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FourButton.setMaximumSize(new java.awt.Dimension(39, 39));
        FourButton.setMinimumSize(new java.awt.Dimension(39, 39));
        FourButton.setPreferredSize(new java.awt.Dimension(39, 39));
        FourButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourButtonActionPerformed(evt);
            }
        });

        FiveButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FiveButton.setForeground(new java.awt.Color(64, 64, 64));
        FiveButton.setText("5");
        FiveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FiveButton.setPreferredSize(new java.awt.Dimension(39, 39));
        FiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FiveButtonActionPerformed(evt);
            }
        });

        SixButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SixButton.setForeground(new java.awt.Color(64, 64, 64));
        SixButton.setText("6");
        SixButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SixButton.setMaximumSize(new java.awt.Dimension(39, 39));
        SixButton.setMinimumSize(new java.awt.Dimension(39, 39));
        SixButton.setPreferredSize(new java.awt.Dimension(39, 39));
        SixButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SixButtonActionPerformed(evt);
            }
        });

        OneButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OneButton.setForeground(new java.awt.Color(64, 64, 64));
        OneButton.setText("1");
        OneButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OneButton.setMaximumSize(new java.awt.Dimension(39, 39));
        OneButton.setMinimumSize(new java.awt.Dimension(39, 39));
        OneButton.setPreferredSize(new java.awt.Dimension(39, 39));
        OneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OneButtonActionPerformed(evt);
            }
        });

        TwoButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TwoButton.setForeground(new java.awt.Color(64, 64, 64));
        TwoButton.setText("2");
        TwoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TwoButton.setMaximumSize(new java.awt.Dimension(39, 39));
        TwoButton.setMinimumSize(new java.awt.Dimension(39, 39));
        TwoButton.setPreferredSize(new java.awt.Dimension(39, 39));
        TwoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoButtonActionPerformed(evt);
            }
        });

        ThreeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ThreeButton.setForeground(new java.awt.Color(64, 64, 64));
        ThreeButton.setText("3");
        ThreeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThreeButton.setMaximumSize(new java.awt.Dimension(39, 39));
        ThreeButton.setMinimumSize(new java.awt.Dimension(39, 39));
        ThreeButton.setPreferredSize(new java.awt.Dimension(39, 39));
        ThreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThreeButtonActionPerformed(evt);
            }
        });

        ZeroButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ZeroButton.setForeground(new java.awt.Color(64, 64, 64));
        ZeroButton.setText("0");
        ZeroButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ZeroButton.setMaximumSize(new java.awt.Dimension(39, 39));
        ZeroButton.setMinimumSize(new java.awt.Dimension(39, 39));
        ZeroButton.setPreferredSize(new java.awt.Dimension(39, 39));
        ZeroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZeroButtonActionPerformed(evt);
            }
        });

        EqualsButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EqualsButton.setText("=");
        EqualsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EqualsButton.setMaximumSize(new java.awt.Dimension(78, 39));
        EqualsButton.setMinimumSize(new java.awt.Dimension(78, 39));
        EqualsButton.setPreferredSize(new java.awt.Dimension(78, 39));
        EqualsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddButton.setText("+");
        AddButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddButton.setMaximumSize(new java.awt.Dimension(39, 39));
        AddButton.setMinimumSize(new java.awt.Dimension(39, 39));
        AddButton.setPreferredSize(new java.awt.Dimension(39, 39));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        MultiplyButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MultiplyButton.setText("×");
        MultiplyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MultiplyButton.setMaximumSize(new java.awt.Dimension(39, 39));
        MultiplyButton.setMinimumSize(new java.awt.Dimension(39, 39));
        MultiplyButton.setPreferredSize(new java.awt.Dimension(39, 39));
        MultiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyButtonActionPerformed(evt);
            }
        });

        DivideButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DivideButton.setText("/");
        DivideButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DivideButton.setMaximumSize(new java.awt.Dimension(39, 39));
        DivideButton.setMinimumSize(new java.awt.Dimension(39, 39));
        DivideButton.setPreferredSize(new java.awt.Dimension(39, 39));
        DivideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideButtonActionPerformed(evt);
            }
        });

        SubtractButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SubtractButton.setText("—");
        SubtractButton.setActionCommand("");
        SubtractButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubtractButton.setPreferredSize(new java.awt.Dimension(39, 39));
        SubtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractButtonActionPerformed(evt);
            }
        });

        OutputTextField.setEditable(false);
        OutputTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OutputTextField.setForeground(new java.awt.Color(94, 94, 94));
        OutputTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DeleteButton.setText("<");
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.setMaximumSize(new java.awt.Dimension(39, 39));
        DeleteButton.setMinimumSize(new java.awt.Dimension(39, 39));
        DeleteButton.setPreferredSize(new java.awt.Dimension(39, 39));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ClearButton.setForeground(new java.awt.Color(64, 64, 64));
        ClearButton.setText("CLEAR");
        ClearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClearButton.setMaximumSize(new java.awt.Dimension(78, 39));
        ClearButton.setMinimumSize(new java.awt.Dimension(78, 39));
        ClearButton.setPreferredSize(new java.awt.Dimension(78, 39));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        PointButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        PointButton.setText(".");
        PointButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PointButton.setMaximumSize(new java.awt.Dimension(39, 39));
        PointButton.setMinimumSize(new java.awt.Dimension(39, 39));
        PointButton.setPreferredSize(new java.awt.Dimension(39, 39));
        PointButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointButtonActionPerformed(evt);
            }
        });

        EitghtButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EitghtButton1.setForeground(new java.awt.Color(64, 64, 64));
        EitghtButton1.setText("7");
        EitghtButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EitghtButton1.setMaximumSize(new java.awt.Dimension(39, 39));
        EitghtButton1.setMinimumSize(new java.awt.Dimension(39, 39));
        EitghtButton1.setPreferredSize(new java.awt.Dimension(39, 39));
        EitghtButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EitghtButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OutputTextField)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ZeroButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PointButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TwoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ThreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DivideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(EqualsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EitghtButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EitghtButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NineButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FourButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SixButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OutputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(SubtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EitghtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EitghtButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FourButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SixButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MultiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TwoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThreeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DivideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZeroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PointButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EqualsButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ThreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThreeButtonActionPerformed
        addToOutputField("3");
    }//GEN-LAST:event_ThreeButtonActionPerformed

    private void DivideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideButtonActionPerformed
        setOperand('/');
    }//GEN-LAST:event_DivideButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        String text = OutputTextField.getText();
        if (text.length() != 0) 
        {
            text = text.substring(0, text.length() - 1);
            if (text.endsWith("."))
                text = text.substring(0, text.length() - 1);
            OutputTextField.setText(text);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void OneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OneButtonActionPerformed
        addToOutputField("1");
    }//GEN-LAST:event_OneButtonActionPerformed

    private void EqualsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsButtonActionPerformed
        String text = OutputTextField.getText();
        if (text.length() == 0) return;
        
        num2 = Double.parseDouble(text);
        OutputTextField.setText(Calculator.Solve(num1, currentOperand, num2));
        
    }//GEN-LAST:event_EqualsButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        OutputTextField.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void ZeroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZeroButtonActionPerformed
        addToOutputField("0");
    }//GEN-LAST:event_ZeroButtonActionPerformed

    private void TwoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoButtonActionPerformed
        addToOutputField("2");
    }//GEN-LAST:event_TwoButtonActionPerformed

    private void EitghtButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EitghtButton1ActionPerformed
        addToOutputField("7");
    }//GEN-LAST:event_EitghtButton1ActionPerformed

    private void EitghtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EitghtButtonActionPerformed
        addToOutputField("8");
    }//GEN-LAST:event_EitghtButtonActionPerformed

    private void NineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NineButtonActionPerformed
        addToOutputField("9");
    }//GEN-LAST:event_NineButtonActionPerformed

    private void FourButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourButtonActionPerformed
        addToOutputField("4");
    }//GEN-LAST:event_FourButtonActionPerformed

    private void FiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FiveButtonActionPerformed
        addToOutputField("5");
    }//GEN-LAST:event_FiveButtonActionPerformed

    private void SixButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SixButtonActionPerformed
        addToOutputField("6");
    }//GEN-LAST:event_SixButtonActionPerformed

    private void SubtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractButtonActionPerformed
        setOperand('-');
    }//GEN-LAST:event_SubtractButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        setOperand('+');
    }//GEN-LAST:event_AddButtonActionPerformed

    private void MultiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyButtonActionPerformed
        setOperand('*');
    }//GEN-LAST:event_MultiplyButtonActionPerformed

    private void PointButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PointButtonActionPerformed
        String text = OutputTextField.getText();
        if (text.length() == 0 || text.contains(".")) 
            return;
        
        else 
            addToOutputField(".");
    }//GEN-LAST:event_PointButtonActionPerformed

    
    public static void main(String args[]) 
    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new CalculatorJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton DivideButton;
    private javax.swing.JButton EitghtButton;
    private javax.swing.JButton EitghtButton1;
    private javax.swing.JButton EqualsButton;
    private javax.swing.JButton FiveButton;
    private javax.swing.JButton FourButton;
    private javax.swing.JButton MultiplyButton;
    private javax.swing.JButton NineButton;
    private javax.swing.JButton OneButton;
    private javax.swing.JTextField OutputTextField;
    private javax.swing.JButton PointButton;
    private javax.swing.JButton SixButton;
    private javax.swing.JButton SubtractButton;
    private javax.swing.JButton ThreeButton;
    private javax.swing.JButton TwoButton;
    private javax.swing.JButton ZeroButton;
    // End of variables declaration//GEN-END:variables
}

$form = [System.Windows.Forms.Form] @{
    Text = 'Sergio Santurde Formulario'
    Size = New-Object System.Drawing.Size(500,500)
    StartPosition="CenterScreen"
}

$Label1 = [System.Windows.Forms.Label] @{
    Text = "Usuario:"
    Location = "40,40"
}
$Label2 = [System.Windows.Forms.Label] @{
    Text = "Contraseña:"
    Location = "40,70"
}
$TextBox1 = [System.Windows.Forms.TextBox] @{
    
    Location = "150,40"
    Size = New-Object System.Drawing.Size(150,20)
}
$TextBox2 = [System.Windows.Forms.TextBox] @{
    Location = "150,70"
    Size = New-Object System.Drawing.Size(150,20)
    PasswordChar = '*'
}
$Button1 = [System.Windows.Forms.Button] @{
    Size=New-Object System.Drawing.Size(75,23)
    Text="OK"
    Location=New-Object System.Drawing.Size(120,220)
}
$Button2 = [System.Windows.Forms.Button] @{
    Size=New-Object System.Drawing.Size(75,23)
    Text="CANCELAR"
    Location=New-Object System.Drawing.Size(220,220)
}
$Button1.Add_Click({$TextBox1  -join""| Out-File Datos.txt})
$Button1.Add_Click({$TextBox2  -join""| Out-File Datos.txt -Append})
$Button2.Add_Click({$Form.Close()})

$Button1.Add_Click({$TextBox1.Text | Out-file datousuario.txt -Append})
$Button1.Add_Click({$TextBox2.Text | Out-file datousuario.txt -Append})

$form.Controls.Add($Label1)
$form.Controls.Add($TextBox1)
$form.Controls.Add($Label2)
$form.Controls.Add($TextBox2)
$form.Controls.Add($Button1)
$form.Controls.Add($Button2)
$form.ShowDialog()

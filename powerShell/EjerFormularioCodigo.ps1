
$MouseEventSig=@'
[DllImport("user32.dll",CharSet=CharSet.Auto, CallingConvention=CallingConvention.StdCall)]
public static extern void mouse_event(long dwFlags, long dx, long dy, long cButtons, long dwExtraInfo);
'@
 
$MouseEvent = Add-Type -memberDefinition $MouseEventSig -name "MouseEventWinApi" -passThru

[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(969,353)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
for($i=1;$i -lt 20;$i++){
    [System.Windows.Forms.SendKeys]::SendWait("TextoUsuario ")
}

Start-Sleep -seconds 2

[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(971,379)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
for($i=1;$i -lt 4;$i++){
    [System.Windows.Forms.SendKeys]::SendWait(" 1234 ")
}

Start-Sleep -seconds 2

[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(878,530)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)

Start-Sleep -seconds 5

[System.Windows.Forms.Cursor]::Position = New-Object System.Drawing.Point(223,978)
$MouseEvent::mouse_event(0x00000002, 0, 0, 0, 0)
$MouseEvent::mouse_event(0x00000004, 0, 0, 0, 0)
#full chatgpt


from tkinter import *
from tkinter import messagebox

def mensaje():

    messagebox.showinfo("Mensaje", "Hola desde Python.")

ventana = Tk()

ventana.title("Botón Python")

ventana.geometry("300x200")

boton = Button(ventana,
               text="Presioname",
               command=mensaje)

boton.pack(pady=50)

ventana.mainloop()
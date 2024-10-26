package Interfaces;

    class Program 
    {
        static void Main(string[] args)
        {
            Auto miAuto = new Auto(0);

            Console.Write("Ingrese la cantidad de gasolina para tanquear: ");
            int cantidad = int.Parse(Console.ReadLine());

            miAuto.Retanquear(cantidad);

            miAuto.Conducir();
        }
    }
}

package INTERFACES;


class VehiculoBase;
{
    abstract class VehiculoBase
    {

        public abstract void Conducir();


        public abstract bool Retanquear(int cantidadGasolina);
    }

    class Auto : VehiculoBase
    {
        private int gasolina;

        public Auto(int gasolinaInicial)
        {
            gasolina = gasolinaInicial;
        }

        public override void Conducir()
        {
            if (gasolina > 0)
            {
                Console.WriteLine("El coche está conduciendo.");
            }
            else
            {
                Console.WriteLine("No hay suficiente gasolina para conducir.");
            }
        }

        public override bool Retanquear(int cantidadGasolina)
        {
            gasolina += cantidadGasolina;
            Console.WriteLine($"Se ha tanquedado con {cantidadGasolina} unidades de gasolina. Gasolina actual: {gasolina}");
            return true;
        }
    }

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

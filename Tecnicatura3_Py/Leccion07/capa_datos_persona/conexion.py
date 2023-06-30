from psycopg2 import pool
from logger_base import log
import sys
class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _MIN_CON=1
    _MAX_CON=5
    _pool= None 
   

    @classmethod
    def obtenerConexion(cls):
        conexion = cls.obtenerPool().getconn()
        log.debug(f'Conexión obtenida del pool:{conexion}')
        return conexion

    # AGREGAR CURSOR
    @classmethod
    def obtenerCursor(cls):


    @classmethod
    def obtenerPool(cls):
    if cls.pool is None:
        try:
            cls.pool = pool.SimpleConnectionPool(cls._MIN_CON,
                                                 cls._MAX_CON,
                                                 host=cls._HOST,
                                                 user=cls._USERNAME,
                                                 password=cls._PASSWORD,
                                                 port=cls._DB_PORT,
                                                 database=cls._DATABASE)
            log.debug(f'creación del pool exitosa:{cls._pool}')
            return cls._pool
        except Exceptin as e:
            log.error(f'ocurrió un error al obtener el pool: {e}')
            sys.exit()
    else:
        return cls._pool
    #Fernando Rojas
    @classmethod
    def liberarConexion(cls, conexion):
        cls.obtenerPool().putconn(conexion)
        log.debug(f'Regresamos la conexion del pool: {conexion}')

    @classmethod
    def cerrarConexones(cls):
        cls.obtenerPool().closeall()

        
if __name__ == '__main__':
<<<<<<< HEAD
    pass
=======
    conexion1 = Conxion.obtenerConcexion()
    Conexion.liberarConexion(conexion1)
    conexion2 = Conxion.obtenerConcexion()
    Conexion.liberarConexion(conexion2)
    conexion3 = Conxion.obtenerConcexion()
    Conexion.liberarConexion(conexion3)
    conexion4 = Conxion.obtenerConcexion()
    conexion5 = Conxion.obtenerConcexion()
    conexion6 = Conxion.obtenerConcexion()
  
    
    

>>>>>>> bb68ca8b395cc7c5f9f038f26681c81d7a364285

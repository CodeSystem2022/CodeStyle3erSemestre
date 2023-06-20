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
        pass
        
        
# AGREGAR CURSOR        
@classmethod
def obtenerCursor(cls):
   pass

@classmethod
def obtenerPool(cls):
    if cls.pool is None:
        try:
            cls.pool = pool.SimpleConnectionPool()
        
if __name__ == '__main__':
    pass
  
    
    


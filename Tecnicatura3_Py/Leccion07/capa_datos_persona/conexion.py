import psycopg2 as bd
from logger_base import log
import sys
class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASWORD = 'admin'
    _DB_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
        if cls.conexion is None:
            try:
                cls._conexion = bd.connect(host=cls._HOST,
                                           user=cls._USERNAME,
                                           pasword=cls._PASWORD,
                                           port= cls._DB_PORT,
                                           database=cls._DATABASE)
                log.debug(f'conexión Exitosa: {cls._conexion}')
                return cls._conexion
            except Exception as e:
                log.error(f'ocurrio un error; {e}')
                sys.exit()
        else:
            return cls._conexion


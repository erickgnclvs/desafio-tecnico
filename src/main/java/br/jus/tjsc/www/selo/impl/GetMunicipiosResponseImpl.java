/*
 * XML Type:  getMunicipiosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMunicipiosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getMunicipiosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetMunicipiosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMunicipiosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetMunicipiosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MUNICIPIOS$0 = 
        new javax.xml.namespace.QName("", "municipios");
    
    
    /**
     * Gets array of all "municipios" elements
     */
    public br.jus.tjsc.www.selo.Municipio[] getMunicipiosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MUNICIPIOS$0, targetList);
            br.jus.tjsc.www.selo.Municipio[] result = new br.jus.tjsc.www.selo.Municipio[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "municipios" element
     */
    public br.jus.tjsc.www.selo.Municipio getMunicipiosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Municipio target = null;
            target = (br.jus.tjsc.www.selo.Municipio)get_store().find_element_user(MUNICIPIOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "municipios" element
     */
    public int sizeOfMunicipiosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MUNICIPIOS$0);
        }
    }
    
    /**
     * Sets array of all "municipios" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setMunicipiosArray(br.jus.tjsc.www.selo.Municipio[] municipiosArray)
    {
        check_orphaned();
        arraySetterHelper(municipiosArray, MUNICIPIOS$0);
    }
    
    /**
     * Sets ith "municipios" element
     */
    public void setMunicipiosArray(int i, br.jus.tjsc.www.selo.Municipio municipios)
    {
        generatedSetterHelperImpl(municipios, MUNICIPIOS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "municipios" element
     */
    public br.jus.tjsc.www.selo.Municipio insertNewMunicipios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Municipio target = null;
            target = (br.jus.tjsc.www.selo.Municipio)get_store().insert_element_user(MUNICIPIOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "municipios" element
     */
    public br.jus.tjsc.www.selo.Municipio addNewMunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.Municipio target = null;
            target = (br.jus.tjsc.www.selo.Municipio)get_store().add_element_user(MUNICIPIOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "municipios" element
     */
    public void removeMunicipios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MUNICIPIOS$0, i);
        }
    }
}
